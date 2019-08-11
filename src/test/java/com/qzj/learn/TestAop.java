package com.qzj.learn;

import com.qzj.impl.LogicInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext actx = new FileSystemXmlApplicationContext(
                "exception_config.xml");
        //动态代理
//        LogicInterface li = (LogicInterface) actx.getBean("logic1");
//        li.doInsert("新增");
//        li.doUpdate("修改");
//        li.doDelete("删除");
        //CGLIB代理
        Logic2 li2 = (Logic2) actx.getBean("logic2");
        li2.doInsert("新增");
        li2.doUpdate("修改");
        li2.doDelete("删除");
    }
}
