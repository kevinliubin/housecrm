package com.lb.ssm.vo;

public class User {
    private Integer userid;

    private String username;

    private String userpassword;

    private String usersex;

    private String userphone;

    private Integer userstate;

    private String usercard;

    private String usercardname;

    private String useraddr;

    private String userindate;

    private String useroutdate;

    private Integer userroleid;

    private String loginintime;

    private String loginouttime;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public Integer getUserstate() {
        return userstate;
    }

    public void setUserstate(Integer userstate) {
        this.userstate = userstate;
    }

    public String getUsercard() {
        return usercard;
    }

    public void setUsercard(String usercard) {
        this.usercard = usercard == null ? null : usercard.trim();
    }

    public String getUsercardname() {
        return usercardname;
    }

    public void setUsercardname(String usercardname) {
        this.usercardname = usercardname == null ? null : usercardname.trim();
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr == null ? null : useraddr.trim();
    }

    public String getUserindate() {
        return userindate;
    }

    public void setUserindate(String userindate) {
        this.userindate = userindate == null ? null : userindate.trim();
    }

    public String getUseroutdate() {
        return useroutdate;
    }

    public void setUseroutdate(String useroutdate) {
        this.useroutdate = useroutdate == null ? null : useroutdate.trim();
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public String getLoginintime() {
        return loginintime;
    }

    public void setLoginintime(String loginintime) {
        this.loginintime = loginintime == null ? null : loginintime.trim();
    }

    public String getLoginouttime() {
        return loginouttime;
    }

    public void setLoginouttime(String loginouttime) {
        this.loginouttime = loginouttime == null ? null : loginouttime.trim();
    }
}