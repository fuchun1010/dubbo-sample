package com.tank.provider;

import com.tank.api.DemoService;

/**
 * @author fuchun
 */
public class DemoServiceImpl implements DemoService {

  /**
   * @param words
   * @return
   */
  public String sayHello(final String words) {
    return String.format("hello,%s", words);
  }
}
