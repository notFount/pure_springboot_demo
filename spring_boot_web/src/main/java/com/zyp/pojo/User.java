package com.zyp.pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userOrgname;

    private String userOrgcode;

    private String userCity;

    private String userPename;

    private String userIdcode;

    private String userStatus;

    private String userEditmessage;

    private String userVerifystatus;

    private Date userCreatetime;

    private Date userModifiedtime;

    private String userStrone;

    private String userStrtwo;

    private String userStrthree;

    private String userStrfour;

    private String userStrfive;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserOrgname() {
        return userOrgname;
    }

    public void setUserOrgname(String userOrgname) {
        this.userOrgname = userOrgname == null ? null : userOrgname.trim();
    }

    public String getUserOrgcode() {
        return userOrgcode;
    }

    public void setUserOrgcode(String userOrgcode) {
        this.userOrgcode = userOrgcode == null ? null : userOrgcode.trim();
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity == null ? null : userCity.trim();
    }

    public String getUserPename() {
        return userPename;
    }

    public void setUserPename(String userPename) {
        this.userPename = userPename == null ? null : userPename.trim();
    }

    public String getUserIdcode() {
        return userIdcode;
    }

    public void setUserIdcode(String userIdcode) {
        this.userIdcode = userIdcode == null ? null : userIdcode.trim();
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus == null ? null : userStatus.trim();
    }

    public String getUserEditmessage() {
        return userEditmessage;
    }

    public void setUserEditmessage(String userEditmessage) {
        this.userEditmessage = userEditmessage == null ? null : userEditmessage.trim();
    }

    public String getUserVerifystatus() {
        return userVerifystatus;
    }

    public void setUserVerifystatus(String userVerifystatus) {
        this.userVerifystatus = userVerifystatus == null ? null : userVerifystatus.trim();
    }

    public Date getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(Date userCreatetime) {
        this.userCreatetime = userCreatetime;
    }

    public Date getUserModifiedtime() {
        return userModifiedtime;
    }

    public void setUserModifiedtime(Date userModifiedtime) {
        this.userModifiedtime = userModifiedtime;
    }

    public String getUserStrone() {
        return userStrone;
    }

    public void setUserStrone(String userStrone) {
        this.userStrone = userStrone == null ? null : userStrone.trim();
    }

    public String getUserStrtwo() {
        return userStrtwo;
    }

    public void setUserStrtwo(String userStrtwo) {
        this.userStrtwo = userStrtwo == null ? null : userStrtwo.trim();
    }

    public String getUserStrthree() {
        return userStrthree;
    }

    public void setUserStrthree(String userStrthree) {
        this.userStrthree = userStrthree == null ? null : userStrthree.trim();
    }

    public String getUserStrfour() {
        return userStrfour;
    }

    public void setUserStrfour(String userStrfour) {
        this.userStrfour = userStrfour == null ? null : userStrfour.trim();
    }

    public String getUserStrfive() {
        return userStrfive;
    }

    public void setUserStrfive(String userStrfive) {
        this.userStrfive = userStrfive == null ? null : userStrfive.trim();
    }
}