package com.gf.simplefactory;

/*
 * Author guanfei
 * Date 2018/11/9
 */
public class Factory {

    public static Api createApi(){
        return new Impl();
    }
}
