package com.gf;

/*
 * Author guanfei
 * Date 2018/11/14
 */

/**
 * 使用枚举实现单例
 */
public enum SingletonEnum {

    SINGLETON;

    public void operation(){
        System.out.println("单例-枚举实现");
    }
}
