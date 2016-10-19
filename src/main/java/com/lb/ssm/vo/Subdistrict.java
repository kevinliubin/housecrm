package com.lb.ssm.vo;

public class Subdistrict {
    private Integer subdistrictid;

    private String subdistrictname;

    private String subdistrictdiscribe;

    private String subdistrictaddr;

    private String subdistrictpic;

    private String subdistrictbelong;

    private String subdistrictpic2;

    private String subdistrictpic3;

    public Integer getSubdistrictid() {
        return subdistrictid;
    }

    public void setSubdistrictid(Integer subdistrictid) {
        this.subdistrictid = subdistrictid;
    }

    public String getSubdistrictname() {
        return subdistrictname;
    }

    public void setSubdistrictname(String subdistrictname) {
        this.subdistrictname = subdistrictname == null ? null : subdistrictname.trim();
    }

    public String getSubdistrictdiscribe() {
        return subdistrictdiscribe;
    }

    public void setSubdistrictdiscribe(String subdistrictdiscribe) {
        this.subdistrictdiscribe = subdistrictdiscribe == null ? null : subdistrictdiscribe.trim();
    }

    public String getSubdistrictaddr() {
        return subdistrictaddr;
    }

    public void setSubdistrictaddr(String subdistrictaddr) {
        this.subdistrictaddr = subdistrictaddr == null ? null : subdistrictaddr.trim();
    }

    public String getSubdistrictpic() {
        return subdistrictpic;
    }

    public void setSubdistrictpic(String subdistrictpic) {
        this.subdistrictpic = subdistrictpic == null ? null : subdistrictpic.trim();
    }

    public String getSubdistrictbelong() {
        return subdistrictbelong;
    }

    public void setSubdistrictbelong(String subdistrictbelong) {
        this.subdistrictbelong = subdistrictbelong == null ? null : subdistrictbelong.trim();
    }

    public String getSubdistrictpic2() {
        return subdistrictpic2;
    }

    public void setSubdistrictpic2(String subdistrictpic2) {
        this.subdistrictpic2 = subdistrictpic2 == null ? null : subdistrictpic2.trim();
    }

    public String getSubdistrictpic3() {
        return subdistrictpic3;
    }

    public void setSubdistrictpic3(String subdistrictpic3) {
        this.subdistrictpic3 = subdistrictpic3 == null ? null : subdistrictpic3.trim();
    }
}