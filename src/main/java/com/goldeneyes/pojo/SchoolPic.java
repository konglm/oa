package com.goldeneyes.pojo;

public class SchoolPic {
    private Integer tabid;

    private String schoolid;

    private String picaddr;

    private Integer orderid;

    private Byte status;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid == null ? null : schoolid.trim();
    }

    public String getPicaddr() {
        return picaddr;
    }

    public void setPicaddr(String picaddr) {
        this.picaddr = picaddr == null ? null : picaddr.trim();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}