package com.yhy.easyrouter.entity;

import java.io.Serializable;

/**
 * author : 颜洪毅
 * e-mail : yhyzgn@gmail.com
 * time   : 2017-10-23 8:41
 * version: 1.0.0
 * desc   :
 */
public class SeriaEntity implements Serializable {

    public String test;

    public SeriaEntity(String test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "SeriaEntity{" +
                "test='" + test + '\'' +
                '}';
    }
}
