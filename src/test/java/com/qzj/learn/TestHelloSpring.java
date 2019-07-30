package com.qzj.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHelloSpring {
    public static void main(String[] args) {
        //通过ApplicationContext来获取Spring的配置文件
        ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
        //通过Bean的id来获取Bean
        HelloSpring hs = (HelloSpring) actx.getBean("HelloSpring");
        System.out.println(hs.getMsg());
    }
}
