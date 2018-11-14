package com.gf;

/*
 * Author guanfei
 * Date 2018/11/13
 */

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class LogModel implements Serializable {

    private String logId;
    private String operateUser;
    private String operateTime;
    private String logContent;

}
