package com.example.controller;

import com.example.pojo.Dept;
import com.example.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {

    private DeptService service;

    public DeptController(DeptService service) {
        this.service = service;
    }

    @PatchMapping("/dept/add")
    boolean addDept(Dept dept) {
        return service.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    Dept queryById(Long id) {
        return service.queryById(id);
    }

    @GetMapping("/dept/list")
    List<Dept> queryAll() {
        return service.queryAll();
    }
}
