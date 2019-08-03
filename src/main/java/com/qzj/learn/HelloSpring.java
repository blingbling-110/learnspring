package com.qzj.learn;

import java.util.Date;

public class HelloSpring {
    public String msg = null;
    public Date date = null;

    public HelloSpring() {

    }

    public HelloSpring(String msg) {
        this.msg = msg;
    }

//    public void init() {
//        this.msg = "Hello, Spring!";
//        this.date = new Date();
//    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
