package com.alibaba.monitor.designPattern.factoryMethod;

import org.junit.Test;

/**
 * 工厂模式适合：凡是出现了大量的产品需要创建，
 * 并且具有共同的接口时，可以通过工厂方法模式进行创建。
 * 在以下的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，
 * 第三种相对于第二种，不需要实例化工厂类。
 * 所以，大多数情况下，我们会选用第三种——静态工厂方法模式。
 *
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class FactoryTest {

    /**
     * 普通工厂模式
     */
    @Test
    public void FactoryMethodTest() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("mail");
        sender.send();
    }

    /**
     * 多个工厂方法模式
     */
    @Test
    public void MoreFactoryMethodTest() {
        SendFactory factory = new SendFactory();
        Sender senderMail = factory.produceMail();
        senderMail.send();

        Sender senderSms = factory.produceSms();
        senderSms.send();
    }

    /**
     * 静态工厂模式
     */
    @Test
    public void StaticFactoryMethodTest() {
        Sender sender = SendFactory.staticProduceMail();
        sender.send();
    }

}
