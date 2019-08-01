package com.qzj.learn;

import com.qzj.impl.Hello;

public class EnHello implements Hello {
    public String msg = null;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String doSalutation() {
        return "Hello " + this.msg;
    }
}
