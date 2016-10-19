package com.lb.ssm.vo;

public class Pushcell {
    private Integer pushid;

    private String pushdate;

    private Integer pushcellid;

    private Integer pushcushid;

    private String pushcushname;

    public Integer getPushid() {
        return pushid;
    }

    public void setPushid(Integer pushid) {
        this.pushid = pushid;
    }

    public String getPushdate() {
        return pushdate;
    }

    public void setPushdate(String pushdate) {
        this.pushdate = pushdate == null ? null : pushdate.trim();
    }

    public Integer getPushcellid() {
        return pushcellid;
    }

    public void setPushcellid(Integer pushcellid) {
        this.pushcellid = pushcellid;
    }

    public Integer getPushcushid() {
        return pushcushid;
    }

    public void setPushcushid(Integer pushcushid) {
        this.pushcushid = pushcushid;
    }

    public String getPushcushname() {
        return pushcushname;
    }

    public void setPushcushname(String pushcushname) {
        this.pushcushname = pushcushname == null ? null : pushcushname.trim();
    }
}