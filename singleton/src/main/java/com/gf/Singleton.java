package com.gf;

/*
 * Author guanfei
 * Date 2018/11/14
 */
public class Singleton {

    private static class SingletonHolder{ //lazy initializing holder class
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }

}
