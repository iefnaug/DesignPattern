package com.gf;

import sun.rmi.log.ReliableLog;

import java.io.*;
import java.util.List;

/*
 * Author guanfei
 * Date 2018/11/13
 */
public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "AdapterLog.log";

    public LogFileOperate(String logFilePathName){
        if(logFilePathName != null && logFilePathName.length() >  0){
            this.logFilePathName = logFilePathName;
        }
    }

    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream inputStream = null;
        try{
            File file = new File(logFilePathName);
            if(file.exists()){
                inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>) inputStream.readObject();
            }else{
                return list;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    public void writeLogFile(List<LogModel> logModels) {
        ObjectOutputStream objectOutputStream = null;
        File file = new File(logFilePathName);
        try {
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            objectOutputStream.writeObject(logModels);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (objectOutputStream != null){
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
