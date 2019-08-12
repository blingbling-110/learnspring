package com.qzj.learn;

import com.qzj.impl.LogicInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext actx = new FileSystemXmlApplicationContext(
                "exception_config.xml");
        try {
            //自动动态代理
//        LogicInterface li = (LogicInterface) actx.getBean("logic1");
//        li.doInsert("新增");
//        li.doUpdate("修改");
//        li.doDelete("删除");
            //自动CGLIB代理
//        Logic2 l = (Logic2) actx.getBean("logic2");
//        l.doInsert("新增");
//        l.doUpdate("修改");
//        l.doDelete("删除");
            //手动动态代理
//        LogicInterface li = (LogicInterface) actx.getBean("logic1Proxy");
//        li.doInsert("新增");
//        li.doUpdate("修改");
//        li.doDelete("删除");
            //手动CGLIB代理
            Logic2 l = (Logic2) actx.getBean("logic2Proxy");
            l.doInsert("新增");
            l.doUpdate("修改");
            l.doDelete("删除");
        }catch (Exception e) {

        }
    }
}
