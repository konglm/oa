package com.goldeneyes.pojo;

import java.util.Date;

public class Announcement {
    private Integer tabid;

    private String schoolid;

    private String announcementtitle;

    private String tag;

    private String announcementencname;

    private String announcementencaddr;

    private Byte smssync;

    private Long sendmanid;

    private String sendmancode;

    private String sendmanname;

    private String sendmanpic;

    private Date sendtime;

    private Byte status;

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

    private String announcementcontent;

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

    public String getAnnouncementtitle() {
        return announcementtitle;
    }

    public void setAnnouncementtitle(String announcementtitle) {
        this.announcementtitle = announcementtitle == null ? null : announcementtitle.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getAnnouncementencname() {
        return announcementencname;
    }

    public void setAnnouncementencname(String announcementencname) {
        this.announcementencname = announcementencname == null ? null : announcementencname.trim();
    }

    public String getAnnouncementencaddr() {
        return announcementencaddr;
    }

    public void setAnnouncementencaddr(String announcementencaddr) {
        this.announcementencaddr = announcementencaddr == null ? null : announcementencaddr.trim();
    }

    public Byte getSmssync() {
        return smssync;
    }

    public void setSmssync(Byte smssync) {
        this.smssync = smssync;
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

    public String getAnnouncementcontent() {
        return announcementcontent;
    }

    public void setAnnouncementcontent(String announcementcontent) {
        this.announcementcontent = announcementcontent == null ? null : announcementcontent.trim();
    }
}