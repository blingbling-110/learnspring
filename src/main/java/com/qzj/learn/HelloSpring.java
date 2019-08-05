package com.qzj.learn;

import com.qzj.impl.Hello;

import java.util.Date;

public class HelloSpring {
    public String msg = null;
    public Date date = null;

    public HelloSpring() {

    }

    public HelloSpring(String msg) {
        this.msg = msg;
    }

    public HelloSpring(Date date) {
        this.date = date;
    }

    //初始化
    public void init() {
        this.msg = "Hello, Spring!";
        this.date = new Date();
    }

    //销毁
    public void cleanup() {
        this.msg = "";
        this.date = null;
        System.out.println("销毁了msg" + this.msg + "和date" + this.date);
    }

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
