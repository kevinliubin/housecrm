package com.lb.ssm.vo;

public class Log {
    private Integer logid;

    private Integer loguserid;

    private String logusername;

    private String loginip;

    private String operation;

    private String logdate;

    private String remark;

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public Integer getLoguserid() {
        return loguserid;
    }

    public void setLoguserid(Integer loguserid) {
        this.loguserid = loguserid;
    }

    public String getLogusername() {
        return logusername;
    }

    public void setLogusername(String logusername) {
        this.logusername = logusername == null ? null : logusername.trim();
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getLogdate() {
        return logdate;
    }

    public void setLogdate(String logdate) {
        this.logdate = logdate == null ? null : logdate.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}