package com.wflqz.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SysDept {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length = 32)
    private String pk_dept;
    @Column(length = 20)
    private String deptcode;
    @Column(length = 20)
    private String deptname;
    @Column(length = 32)
    private String parentpk;

    public SysDept(){}
    public SysDept(String code, String name, String parent){
        this.setDeptcode(code);
        this.setDeptname(name);
        this.setParentpk(parent);
    }

    public String getPk_dept() {
        return pk_dept;
    }

    public void setPk_dept(String pk_dept) {
        this.pk_dept = pk_dept;
    }

    public String getDeptcode() {
        return deptcode;
    }

    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getParentpk() {
        return parentpk;
    }

    public void setParentpk(String parentpk) {
        this.parentpk = parentpk;
    }
}
