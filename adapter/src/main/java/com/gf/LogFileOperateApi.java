package com.gf;

import java.util.List;

/*
 * Author guanfei
 * Date 2018/11/13
 */
public interface LogFileOperateApi {

    /**
     * 读取日志
     * @return
     */
    public List<LogModel> readLogFile();

    /**
     * 写日志
     */
    public void writeLogFile(List<LogModel> logModels);
}
