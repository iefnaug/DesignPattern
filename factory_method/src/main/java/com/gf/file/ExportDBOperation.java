package com.gf.file;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public class ExportDBOperation extends ExportOperation {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDB();
    }
}
