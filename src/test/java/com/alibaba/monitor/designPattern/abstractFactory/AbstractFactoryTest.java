package com.alibaba.monitor.designPattern.abstractFactory;

import org.junit.Test;

/**
 * 这个模式的好处就是，如果你现在想增加一个功能：发及时信息
 * 则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了
 * 无需去改动现成的代码。这样做，拓展性较好
 *
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class AbstractFactoryTest {

    @Test
    public void abstractFactoryTest() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
