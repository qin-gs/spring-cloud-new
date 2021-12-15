package com.example.service;

import com.example.dao.DeptDao;
import com.example.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    private DeptDao dao;

    public DeptServiceImpl(DeptDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return dao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return dao.queryAll();
    }
}
