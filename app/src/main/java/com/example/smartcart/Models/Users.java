package com.example.smartcart.Models;

public class Users {
    String userName,mail,password,phoneNo,userId;

    public Users()
    {

    }

    public Users(String userName, String mail, String password, String phoneNo, String userId) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.phoneNo = phoneNo;
        this.userId = userId;
    }

    public Users(String userName, String mail, String password, String phoneNo) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
