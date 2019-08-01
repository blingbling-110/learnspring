package com.qzj.learn;

import java.util.Date;

public class HelloSpring {
    public String msg = null;
    public Date date = null;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public HelloSpring(String msg) {
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
