package com.gf.file;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public class ExportTxtFileOperation extends ExportOperation {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTxtFile();
    }
}
