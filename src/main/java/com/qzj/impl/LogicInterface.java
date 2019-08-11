package com.qzj.impl;

//该接口主要用来实现使用SpringAOP的动态代理机制
public interface LogicInterface {
    public void doInsert(String name);

    public void doUpdate(String name);

    public void doDelete(String name);
}
