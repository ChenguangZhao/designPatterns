package com.alibaba.monitor.designPattern.factoryMethod;

/**
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }

    /**
     * 多方法工厂
     * @return
     */
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    /**
     * 静态工厂
     * @return
     */
    public static Sender staticProduceMail(){
        return new MailSender();
    }

    public static Sender staticProduceSms(){
        return new SmsSender();
    }
}
