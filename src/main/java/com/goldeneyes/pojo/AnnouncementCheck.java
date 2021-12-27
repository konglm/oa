package com.goldeneyes.pojo;

import java.util.Date;

public class AnnouncementCheck {
    private Integer tabid;

    private Integer announcementid;

    private Date checktime;

    private String checkcontent;

    private Byte checkstatus;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getAnnouncementid() {
        return announcementid;
    }

    public void setAnnouncementid(Integer announcementid) {
        this.announcementid = announcementid;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getCheckcontent() {
        return checkcontent;
    }

    public void setCheckcontent(String checkcontent) {
        this.checkcontent = checkcontent == null ? null : checkcontent.trim();
    }

    public Byte getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Byte checkstatus) {
        this.checkstatus = checkstatus;
    }
}