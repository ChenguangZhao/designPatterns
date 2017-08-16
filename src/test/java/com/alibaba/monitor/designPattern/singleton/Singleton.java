package com.alibaba.monitor.designPattern.singleton;

/**
 * @Title:
 * @Description:
 * @author: chenguang.zcg
 * @version:1.1.0
 * @date 2017/08/16
 */
public class Singleton {

    private String name;

    /**
     * 私有构造方法，防止被实例化
     **/
    private Singleton() {
    }

    /**
     * 此处使用一个内部类来维护单例
     **/
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /**
     * 获取实例
     *
     */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
            "name='" + name + '\'' +
            '}';
    }
}
