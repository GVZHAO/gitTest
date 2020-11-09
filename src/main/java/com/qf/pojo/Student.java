package com.qf.pojo;

import javax.print.DocFlavor;

public class Student {

    private Integer uid;
    private String uname;
    private String upassword;
    private Integer ublance;
    private String utel;

    public Student() {
    }

    public Student(Integer uid, String uname, String upassword, Integer ublance, String utel) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.ublance = ublance;
        this.utel = utel;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public Integer getUblance() {
        return ublance;
    }

    public void setUblance(Integer ublance) {
        this.ublance = ublance;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", upassword='" + upassword + '\'' +
                ", ublance=" + ublance +
                ", utel='" + utel + '\'' +
                '}';
    }
}
