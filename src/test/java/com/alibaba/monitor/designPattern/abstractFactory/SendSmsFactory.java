package com.alibaba.monitor.designPattern.abstractFactory;

/**
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class SendSmsFactory implements Provider {

    public Sender produce() {
        return new SmsSender();
    }
}
