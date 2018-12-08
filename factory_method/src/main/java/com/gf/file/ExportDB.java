package com.gf.file;

/*
 * Author guanfei
 * Date 2018/12/9
 */
public class ExportDB implements ExportFileApi{

    public boolean export(String data){
        System.out.println("导出数据库文件:" + data);
        return true;
    }
}
