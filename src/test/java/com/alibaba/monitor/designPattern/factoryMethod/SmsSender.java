package com.alibaba.monitor.designPattern.factoryMethod;

/**
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class SmsSender implements Sender {

    public void send() {
        System.out.println("this is mailsender!");
    }
}
