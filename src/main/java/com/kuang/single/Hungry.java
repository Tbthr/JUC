package com.kuang.single;

// 饿汉式单例
public class Hungry {

    private Hungry() {
    }

    // 可能会浪费空间
    private final static Hungry HUNGRY = new Hungry();

    public static Hungry getInstance() {
        return HUNGRY;
    }
}
