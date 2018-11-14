package com.gf;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

/*
 * Author guanfei
 * Date 2018/11/13
 */
public class Client {

    public static void main(String[] args) {
        LogModel logModel = new LogModel();
        logModel.setLogId("0001");
        logModel.setOperateUser("guanfei");
        logModel.setLogContent("something went wrong!");
        logModel.setOperateTime("2018-11-13 09:22:45");

        List<LogModel> logModels = new ArrayList<>();
        logModels.add(logModel);


        LogFileOperate operate = new LogFileOperate("info.log");
        operate.writeLogFile(logModels);
        List<LogModel> list = operate.readLogFile();
        System.out.println();
    }

}
