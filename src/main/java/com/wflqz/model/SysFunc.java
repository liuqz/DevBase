package com.wflqz.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SysFunc {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(length = 32)
    private String pk_func;
    @Column(length = 20)
    private String funccode;
    @Column(length = 20)
    private String funcname;
    @Column(length = 50)
    private String funcurl;
    @Column(length = 50)
    private String funcicon;
    @Column(length = 32)
    private String parentpk;
    @Column(length = 2)
    private String enable;

    public String getPk_func() {
        return pk_func;
    }

    public void setPk_func(String pk_func) {
        this.pk_func = pk_func;
    }

    public String getFunccode() {
        return funccode;
    }

    public void setFunccode(String funccode) {
        this.funccode = funccode;
    }

    public String getFuncname() {
        return funcname;
    }

    public void setFuncname(String funcname) {
        this.funcname = funcname;
    }

    public String getFuncurl() {
        return funcurl;
    }

    public void setFuncurl(String funcurl) {
        this.funcurl = funcurl;
    }

    public String getFuncicon() {
        return funcicon;
    }

    public void setFuncicon(String funcicon) {
        this.funcicon = funcicon;
    }

    public String getParentpk() {
        return parentpk;
    }

    public void setParentpk(String parentpk) {
        this.parentpk = parentpk;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }
}
