package com.gf.factorymethod;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public abstract class Creator {

    protected abstract Product factoryMethod();

    public void someOperation(){
        Product product = factoryMethod();
    }
}
