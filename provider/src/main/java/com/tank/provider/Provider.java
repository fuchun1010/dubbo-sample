package com.tank.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 */
public class Provider {
  public static void main(String[] args) {
    final CountDownLatch latch = new CountDownLatch(1);
    ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(new String[]{"/META-INF/spring/provider.xml"});
    app.start();
    System.out.println("...provider started successfully...");
    try {
      latch.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      latch.countDown();
    }));
  }
}
