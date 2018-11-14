package com.gf;

import java.io.IOException;
import java.util.Properties;

/*
 * Author guanfei
 * Date 2018/11/14
 */
public class AppConfig {

    private volatile static AppConfig appConfig = null;

    public static AppConfig getInstance(){ //使用double check 增强性能
        if(appConfig == null){
            synchronized (AppConfig.class){
                if(appConfig == null){
                    return new AppConfig();
                }
            }
        }
        return appConfig;
    }

    private AppConfig(){
        readConfig();
    }

    private String name;
    private String address;

    private void readConfig() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/app.properties"));
            this.name = properties.getProperty("name");
            this.address = properties.getProperty("address");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
