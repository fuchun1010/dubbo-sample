package com.tank.consumer;

import com.tank.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class Customer {
  public static void main(String[] args) {
    final String[] path = new String[]{"META-INF/spring/consumer.xml"};
    ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(path);
    DemoService demoService = (DemoService) app.getBean("demoService");
    System.out.println("response  = [" + demoService.sayHello("welcome to dubbo") + "]");
  }
}
