package com.qf.utils;

import com.qf.pojo.Music;

import java.util.Map;

public class MusicDataView {
    private int code;
    private String msg;
    private Music data;

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

    public Music getData() {
        return data;
    }

    public void setData(Music data) {
        this.data = data;
    }
}
