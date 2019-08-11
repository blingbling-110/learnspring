package com.qzj.learn;

import com.qzj.impl.LogicInterface;

public class Logic1 implements LogicInterface {
    @Override
    public void doInsert(String name) {
        System.out.println("执行具体负责新增的业务逻辑……");
        //模拟执行时间
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doUpdate(String name) {
        System.out.println("执行具体负责修改的业务逻辑……");
        //模拟执行时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doDelete(String name) {
        System.out.println("执行具体负责删除的业务逻辑……");
        //异常发生
        int i = 1 / 0;
    }
}
