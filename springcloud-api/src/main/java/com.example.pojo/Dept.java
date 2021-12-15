package com.example.pojo;

import java.io.Serializable;

public class Dept implements Serializable {

    private Long deptno;
    private String dbname;
    private String db_source;

    public Dept() {
    }

    public Dept(String dbname) {
        this.dbname = dbname;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dbname='" + dbname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }


    public static final class DeptBuilder {
        private Long deptno;
        private String dbname;
        private String db_source;

        private DeptBuilder() {
        }

        public static DeptBuilder aDept() {
            return new DeptBuilder();
        }

        public DeptBuilder deptno(Long deptno) {
            this.deptno = deptno;
            return this;
        }

        public DeptBuilder dbname(String dbname) {
            this.dbname = dbname;
            return this;
        }

        public DeptBuilder db_source(String db_source) {
            this.db_source = db_source;
            return this;
        }

        public Dept build() {
            Dept dept = new Dept();
            dept.setDeptno(deptno);
            dept.setDbname(dbname);
            dept.setDb_source(db_source);
            return dept;
        }
    }
}
