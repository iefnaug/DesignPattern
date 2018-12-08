package com.gf.file;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public abstract class ExportOperation {

    public boolean export(String data){
        ExportFileApi fileApi = factoryMethod();
        return fileApi.export(data);
    }

    protected abstract ExportFileApi  factoryMethod();
}
