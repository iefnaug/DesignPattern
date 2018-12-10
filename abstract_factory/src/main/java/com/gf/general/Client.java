package com.gf.general;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory af = new ConcreteFactory1();
        af.createProductA();
        af.createProductB();
    }
}
