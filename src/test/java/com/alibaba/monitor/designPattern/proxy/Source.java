package com.alibaba.monitor.designPattern.proxy;

/**
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class Source implements Sourceable {

    /**
     *
     */
    public void method() {
        System.out.println("the original method!");
    }
}
