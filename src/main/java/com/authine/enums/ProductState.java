package com.authine.enums;

public enum ProductState {
    UP(0,"在架"),DOWN(1,"下架");
    private int code;
    private String msg;

    private  ProductState(int code,String msg){
        this.code=code;
        this.msg=msg;
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
