package com.goldeneyes.pojo;

import java.util.Date;

public class SchoolWeekWork {
    private Integer tabid;

    private String schoolid;

    private String yearid;

    private String periodid;

    private String periodname;

    private Integer week;

    private String lasttitle;

    private String title;

    private String tag;

    private Date begintime;

    private Date endtime;

    private String workdept;

    private Long sendmanid;

    private String sendmancode;

    private String sendmanname;

    private String sendmanpic;

    private Date sendtime;

    private Byte status;

    private Byte isshow;

    private String weekwork;

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

    public String getYearid() {
        return yearid;
    }

    public void setYearid(String yearid) {
        this.yearid = yearid == null ? null : yearid.trim();
    }

    public String getPeriodid() {
        return periodid;
    }

    public void setPeriodid(String periodid) {
        this.periodid = periodid == null ? null : periodid.trim();
    }

    public String getPeriodname() {
        return periodname;
    }

    public void setPeriodname(String periodname) {
        this.periodname = periodname == null ? null : periodname.trim();
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getLasttitle() {
        return lasttitle;
    }

    public void setLasttitle(String lasttitle) {
        this.lasttitle = lasttitle == null ? null : lasttitle.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getWorkdept() {
        return workdept;
    }

    public void setWorkdept(String workdept) {
        this.workdept = workdept == null ? null : workdept.trim();
    }

    public Long getSendmanid() {
        return sendmanid;
    }

    public void setSendmanid(Long sendmanid) {
        this.sendmanid = sendmanid;
    }

    public String getSendmancode() {
        return sendmancode;
    }

    public void setSendmancode(String sendmancode) {
        this.sendmancode = sendmancode == null ? null : sendmancode.trim();
    }

    public String getSendmanname() {
        return sendmanname;
    }

    public void setSendmanname(String sendmanname) {
        this.sendmanname = sendmanname == null ? null : sendmanname.trim();
    }

    public String getSendmanpic() {
        return sendmanpic;
    }

    public void setSendmanpic(String sendmanpic) {
        this.sendmanpic = sendmanpic == null ? null : sendmanpic.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public String getWeekwork() {
        return weekwork;
    }

    public void setWeekwork(String weekwork) {
        this.weekwork = weekwork == null ? null : weekwork.trim();
    }
}