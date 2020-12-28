package com.cykj.orm;

import com.cykj.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoRun {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user",User.class);
//        System.out.println(user.getUserName()+":"+user.getSex());
        user.init();
    }
}
