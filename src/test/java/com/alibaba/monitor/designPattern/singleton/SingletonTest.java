package com.alibaba.monitor.designPattern.singleton;

import org.junit.Test;

/**
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        s1.setName("s1");
        System.out.println(s2);
    }
}
