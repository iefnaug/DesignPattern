package com.gf.file;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public class TextClient {

    public static void main(String[] args) {
        ExportOperation operation = new ExportTxtFileOperation();
        operation.export("测试文件");
    }
}
