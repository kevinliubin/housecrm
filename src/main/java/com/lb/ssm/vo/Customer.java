package com.lb.ssm.vo;

public class Customer {
    private Integer customerid;

    private String customername;

    private String customerphone;

    private String customerphone2;

    private String customeraddr;

    private String customercard;

    private String customercardname;

    private Integer cellid;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    public String getCustomerphone2() {
        return customerphone2;
    }

    public void setCustomerphone2(String customerphone2) {
        this.customerphone2 = customerphone2 == null ? null : customerphone2.trim();
    }

    public String getCustomeraddr() {
        return customeraddr;
    }

    public void setCustomeraddr(String customeraddr) {
        this.customeraddr = customeraddr == null ? null : customeraddr.trim();
    }

    public String getCustomercard() {
        return customercard;
    }

    public void setCustomercard(String customercard) {
        this.customercard = customercard == null ? null : customercard.trim();
    }

    public String getCustomercardname() {
        return customercardname;
    }

    public void setCustomercardname(String customercardname) {
        this.customercardname = customercardname == null ? null : customercardname.trim();
    }

    public Integer getCellid() {
        return cellid;
    }

    public void setCellid(Integer cellid) {
        this.cellid = cellid;
    }
}