package com.goldeneyes.pojo;

import java.util.Date;

public class InfoUpload {
    private Integer tabid;

    private Integer collectid;

    private String tag;

    private Long receivemanid;

    private String receivemancode;

    private String receivemanname;

    private String receivemanpic;

    private String content;

    private String encname;

    private String encaddr;

    private Date uploadtime;

    private Byte status;

    private Byte closestatus;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getCollectid() {
        return collectid;
    }

    public void setCollectid(Integer collectid) {
        this.collectid = collectid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Long getReceivemanid() {
        return receivemanid;
    }

    public void setReceivemanid(Long receivemanid) {
        this.receivemanid = receivemanid;
    }

    public String getReceivemancode() {
        return receivemancode;
    }

    public void setReceivemancode(String receivemancode) {
        this.receivemancode = receivemancode == null ? null : receivemancode.trim();
    }

    public String getReceivemanname() {
        return receivemanname;
    }

    public void setReceivemanname(String receivemanname) {
        this.receivemanname = receivemanname == null ? null : receivemanname.trim();
    }

    public String getReceivemanpic() {
        return receivemanpic;
    }

    public void setReceivemanpic(String receivemanpic) {
        this.receivemanpic = receivemanpic == null ? null : receivemanpic.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getEncname() {
        return encname;
    }

    public void setEncname(String encname) {
        this.encname = encname == null ? null : encname.trim();
    }

    public String getEncaddr() {
        return encaddr;
    }

    public void setEncaddr(String encaddr) {
        this.encaddr = encaddr == null ? null : encaddr.trim();
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getClosestatus() {
        return closestatus;
    }

    public void setClosestatus(Byte closestatus) {
        this.closestatus = closestatus;
    }
}