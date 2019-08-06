package com.qf.utils;

import com.qf.pojo.User;

import java.util.List;
import java.util.Map;

public class DataView<T> {
    private int code;
    private String msg;
    private User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
