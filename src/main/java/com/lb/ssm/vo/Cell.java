package com.lb.ssm.vo;

public class Cell {
    private Integer cellid;

    private String cellname;

    private Integer cellfloor;

    private Integer cellcustomerid;

    private String cellcustomername;

    private Double cellarea;

    private Double cellmoney;

    private Double celltotal;

    private Double cellpoint;

    private Integer cesubdistrictid;

    private Integer cellstate;

    public Integer getCellid() {
        return cellid;
    }

    public void setCellid(Integer cellid) {
        this.cellid = cellid;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname == null ? null : cellname.trim();
    }

    public Integer getCellfloor() {
        return cellfloor;
    }

    public void setCellfloor(Integer cellfloor) {
        this.cellfloor = cellfloor;
    }

    public Integer getCellcustomerid() {
        return cellcustomerid;
    }

    public void setCellcustomerid(Integer cellcustomerid) {
        this.cellcustomerid = cellcustomerid;
    }

    public String getCellcustomername() {
        return cellcustomername;
    }

    public void setCellcustomername(String cellcustomername) {
        this.cellcustomername = cellcustomername == null ? null : cellcustomername.trim();
    }

    public Double getCellarea() {
        return cellarea;
    }

    public void setCellarea(Double cellarea) {
        this.cellarea = cellarea;
    }

    public Double getCellmoney() {
        return cellmoney;
    }

    public void setCellmoney(Double cellmoney) {
        this.cellmoney = cellmoney;
    }

    public Double getCelltotal() {
        return celltotal;
    }

    public void setCelltotal(Double celltotal) {
        this.celltotal = celltotal;
    }

    public Double getCellpoint() {
        return cellpoint;
    }

    public void setCellpoint(Double cellpoint) {
        this.cellpoint = cellpoint;
    }

    public Integer getCesubdistrictid() {
        return cesubdistrictid;
    }

    public void setCesubdistrictid(Integer cesubdistrictid) {
        this.cesubdistrictid = cesubdistrictid;
    }

    public Integer getCellstate() {
        return cellstate;
    }

    public void setCellstate(Integer cellstate) {
        this.cellstate = cellstate;
    }
}