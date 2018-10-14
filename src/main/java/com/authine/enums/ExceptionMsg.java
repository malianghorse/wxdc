package com.authine.enums;

public enum ExceptionMsg {
    product_isNot_Exixt(0,"商品不存在"),
    product_isNot_On(1,"商品已经下架"),
    product_store_insufficient(2,"库存不足");
    private Integer code;
    private String msg;

    ExceptionMsg(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
