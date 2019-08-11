package com.qzj.learn;

import com.qzj.impl.FinanceInterface;
import com.qzj.impl.TimeBookInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAOPLog {
    public static void main(String[] args) {
        ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
        TimeBookInterface tbi = (TimeBookInterface)actx.getBean("timeBook");
        tbi.doCheck("TimeBook");
//        FinanceInterface fni = (FinanceInterface)actx.getBean("financeLog");
//        fni.doCheck("Finance");
    }
}
