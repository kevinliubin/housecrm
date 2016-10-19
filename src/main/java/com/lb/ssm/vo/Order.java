package com.lb.ssm.vo;

public class Order {
    private Integer orderid;

    private Integer ordercustomerid;

    private String ordercustomername;

    private Integer ordercellid;

    private String orderdate;

    private Integer orderuserid;

    private Integer orderstate;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getOrdercustomerid() {
        return ordercustomerid;
    }

    public void setOrdercustomerid(Integer ordercustomerid) {
        this.ordercustomerid = ordercustomerid;
    }

    public String getOrdercustomername() {
        return ordercustomername;
    }

    public void setOrdercustomername(String ordercustomername) {
        this.ordercustomername = ordercustomername == null ? null : ordercustomername.trim();
    }

    public Integer getOrdercellid() {
        return ordercellid;
    }

    public void setOrdercellid(Integer ordercellid) {
        this.ordercellid = ordercellid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate == null ? null : orderdate.trim();
    }

    public Integer getOrderuserid() {
        return orderuserid;
    }

    public void setOrderuserid(Integer orderuserid) {
        this.orderuserid = orderuserid;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }
}