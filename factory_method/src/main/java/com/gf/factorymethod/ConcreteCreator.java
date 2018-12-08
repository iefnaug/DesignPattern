package com.gf.factorymethod;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }

}
