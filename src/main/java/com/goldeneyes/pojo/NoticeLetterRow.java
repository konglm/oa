package com.goldeneyes.pojo;

public class NoticeLetterRow {
    private Integer tabid;

    private Integer letterid;

    private Long noticemanid;

    private String noticemanname;

    private String noticemandept;

    private Byte noticemanstatus;

    private String lettervalue;

    private Integer orderid;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getLetterid() {
        return letterid;
    }

    public void setLetterid(Integer letterid) {
        this.letterid = letterid;
    }

    public Long getNoticemanid() {
        return noticemanid;
    }

    public void setNoticemanid(Long noticemanid) {
        this.noticemanid = noticemanid;
    }

    public String getNoticemanname() {
        return noticemanname;
    }

    public void setNoticemanname(String noticemanname) {
        this.noticemanname = noticemanname == null ? null : noticemanname.trim();
    }

    public String getNoticemandept() {
        return noticemandept;
    }

    public void setNoticemandept(String noticemandept) {
        this.noticemandept = noticemandept == null ? null : noticemandept.trim();
    }

    public Byte getNoticemanstatus() {
        return noticemanstatus;
    }

    public void setNoticemanstatus(Byte noticemanstatus) {
        this.noticemanstatus = noticemanstatus;
    }

    public String getLettervalue() {
        return lettervalue;
    }

    public void setLettervalue(String lettervalue) {
        this.lettervalue = lettervalue == null ? null : lettervalue.trim();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}