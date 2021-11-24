package com.lagou;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;


public class SpringApplication {

    //创建tomcat 并启动
    public static void run(Class<?> tClass, String... args) {
        try {
            //实例化一个Tomcat
            Tomcat tomcat = new Tomcat();
            tomcat.setPort(8080);
            tomcat.addWebapp("/", "D:\\");
            tomcat.start();
            //监听关闭端口，阻塞式
            tomcat.getServer().await();
        } catch (LifecycleException | ServletException e) {
            e.printStackTrace();
        }
    }
}
