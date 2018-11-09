package com.gf.simplefactory;

/*
 * Author guanfei
 * Date 2018/11/9
 */
public class Client {

    public static void main(String[] args) {
//        Api api = new Impl(); //客户端代码不应该看见api的具体实现类Impl, 这时需要工厂方法
        Api api = Factory.createApi(); //客户端代码不应该看见api的具体实现类Impl, 这时需要工厂方法
        api.test01("str...");
    }
}
