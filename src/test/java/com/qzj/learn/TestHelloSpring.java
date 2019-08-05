package com.qzj.learn;

import com.qzj.impl.Hello;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestHelloSpring {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException {
        //通过ApplicationContext来获取Spring的配置文件
        ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");

        //通过Bean的id来获取Bean
//        HelloSpring hs = (HelloSpring) actx.getBean("HelloSpring");
//        System.out.println(hs.getDate() + " " + hs.getMsg());

        //实现选择中英文输出
//        Hello hello = (Hello) actx.getBean("EnHello");
//        System.out.println(hello.doSalutation());

        //集合的注入
//        Collections cols = (Collections) actx.getBean("Collections");
//        System.out.println("List:" + cols.getList() + "\n" + "Set:" + cols.getSet()
//                + "\n" + "Map:" + cols.getMap() + "\n" + "Properties:" + cols.getProps());

        //通过Class.forName()方法获取类HelloSpring的一个实例
//        Object obj = Class.forName("com.qzj.learn.HelloSpring").newInstance();
        //通过BeanWrapper来设定类HelloSpring的属性
//        BeanWrapper bw = new BeanWrapperImpl(obj);
        //根据类变量设定变量的值
//        bw.setPropertyValue("msg", "Hello, Spring!");
//        bw.setPropertyValue("date", new Date());
        //输出变量值
//        System.out.println(bw.getPropertyValue("date") + " "
//                + bw.getPropertyValue("msg"));

        //通过ClassPathResource获取配置文档
//        ClassPathResource res = new ClassPathResource("config.xml");
        //通过XmlBeanFactory来解析配置文档
//        XmlBeanFactory factory = new XmlBeanFactory(res);
//        HelloSpring hs2 = (HelloSpring) factory.getBean("HelloSpring");
//        System.out.println(hs2.getDate() + " " + hs2.getMsg());

        //设定当前时间
//        Object[] objs = new Object[]{"Hello, Spring!", Calendar.getInstance().getTime()};
        //国际化支持
//        String msg = actx.getMessage("HelloSpring", objs, Locale.US);
//        System.out.println(msg);

        //通过虚拟路径访问资源
//        Resource resource = actx.getResource("classpath:messages.properties");
//        System.out.println(resource.exists());

        Log log = (Log)actx.getBean("log");
        log.doLog("gf");
    }
}
