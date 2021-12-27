package com.goldeneyes.pojo;

import java.util.Date;

public class NoticeLetter {
    private Integer tabid;

    private String schoolid;

    private Byte lettertype;

    private String lettername;

    private String lettercol;

    private Long sendmanid;

    private String sendmancode;

    private String sendmanname;

    private String sendmanpic;

    private Date sendtime;

    private Byte letterstatus;

    private Byte isshow;

    private String msgtype;

    private String smsmsgtypecode;

    private Byte servied;

    private Integer hrsmsid;

    private Byte ischeck;

    private Date checktime;

    private String checkuser;

    private String checkusertname;

    private String checkuserunit;

    private Byte smssync;

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

    public Byte getLettertype() {
        return lettertype;
    }

    public void setLettertype(Byte lettertype) {
        this.lettertype = lettertype;
    }

    public String getLettername() {
        return lettername;
    }

    public void setLettername(String lettername) {
        this.lettername = lettername == null ? null : lettername.trim();
    }

    public String getLettercol() {
        return lettercol;
    }

    public void setLettercol(String lettercol) {
        this.lettercol = lettercol == null ? null : lettercol.trim();
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

    public Byte getLetterstatus() {
        return letterstatus;
    }

    public void setLetterstatus(Byte letterstatus) {
        this.letterstatus = letterstatus;
    }

    public Byte getIsshow() {
        return isshow;
    }

    public void setIsshow(Byte isshow) {
        this.isshow = isshow;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype == null ? null : msgtype.trim();
    }

    public String getSmsmsgtypecode() {
        return smsmsgtypecode;
    }

    public void setSmsmsgtypecode(String smsmsgtypecode) {
        this.smsmsgtypecode = smsmsgtypecode == null ? null : smsmsgtypecode.trim();
    }

    public Byte getServied() {
        return servied;
    }

    public void setServied(Byte servied) {
        this.servied = servied;
    }

    public Integer getHrsmsid() {
        return hrsmsid;
    }

    public void setHrsmsid(Integer hrsmsid) {
        this.hrsmsid = hrsmsid;
    }

    public Byte getIscheck() {
        return ischeck;
    }

    public void setIscheck(Byte ischeck) {
        this.ischeck = ischeck;
    }

    public Date getChecktime() {
        return checktime;
    }

    public void setChecktime(Date checktime) {
        this.checktime = checktime;
    }

    public String getCheckuser() {
        return checkuser;
    }

    public void setCheckuser(String checkuser) {
        this.checkuser = checkuser == null ? null : checkuser.trim();
    }

    public String getCheckusertname() {
        return checkusertname;
    }

    public void setCheckusertname(String checkusertname) {
        this.checkusertname = checkusertname == null ? null : checkusertname.trim();
    }

    public String getCheckuserunit() {
        return checkuserunit;
    }

    public void setCheckuserunit(String checkuserunit) {
        this.checkuserunit = checkuserunit == null ? null : checkuserunit.trim();
    }

    public Byte getSmssync() {
        return smssync;
    }

    public void setSmssync(Byte smssync) {
        this.smssync = smssync;
    }
}