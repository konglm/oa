package com.goldeneyes.pojo;

public class CheckManSet {
    private Integer tabid;

    private Integer checktype;

    private String schoolid;

    private Long checkmanid;

    private String checkmancode;

    private String checkmanname;

    private String checkmanpic;

    private Byte ischeck;

    public Integer getTabid() {
        return tabid;
    }

    public void setTabid(Integer tabid) {
        this.tabid = tabid;
    }

    public Integer getChecktype() {
        return checktype;
    }

    public void setChecktype(Integer checktype) {
        this.checktype = checktype;
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid == null ? null : schoolid.trim();
    }

    public Long getCheckmanid() {
        return checkmanid;
    }

    public void setCheckmanid(Long checkmanid) {
        this.checkmanid = checkmanid;
    }

    public String getCheckmancode() {
        return checkmancode;
    }

    public void setCheckmancode(String checkmancode) {
        this.checkmancode = checkmancode == null ? null : checkmancode.trim();
    }

    public String getCheckmanname() {
        return checkmanname;
    }

    public void setCheckmanname(String checkmanname) {
        this.checkmanname = checkmanname == null ? null : checkmanname.trim();
    }

    public String getCheckmanpic() {
        return checkmanpic;
    }

    public void setCheckmanpic(String checkmanpic) {
        this.checkmanpic = checkmanpic == null ? null : checkmanpic.trim();
    }

    public Byte getIscheck() {
        return ischeck;
    }

    public void setIscheck(Byte ischeck) {
        this.ischeck = ischeck;
    }
}