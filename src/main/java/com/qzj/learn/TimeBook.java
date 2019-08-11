package com.qzj.learn;

import com.qzj.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {
    @Override
    public void doAuditing(String name) {
        //审核数据的相关程序
        System.out.println("审核数据的相关程序正在执行……");
//        int m = 1 / 0;//测试Throw通知
    }

    @Override
    public void doCheck(String name) {
        //财务关账的相关程序
        System.out.println("财务关账的相关程序正在执行……");
    }
}
