package com.qzj.learn;

//该类采用CGLIB代理机制
public class Logic2 {
    public void doInsert(String name) {
        System.out.println("执行具体负责新增的业务逻辑……");
        //模拟执行时间
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doUpdate(String name) {
        System.out.println("执行具体负责修改的业务逻辑……");
        //模拟执行时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void doDelete(String name) {
        System.out.println("执行具体负责删除的业务逻辑……");
        //异常发生
        int i = 1 / 0;
    }
}
