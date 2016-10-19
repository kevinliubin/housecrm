package com.lb.ssm.vo;

public class Role {
    private Integer roleid;

    private String rolename;

    private String roledate;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledate() {
        return roledate;
    }

    public void setRoledate(String roledate) {
        this.roledate = roledate == null ? null : roledate.trim();
    }
}