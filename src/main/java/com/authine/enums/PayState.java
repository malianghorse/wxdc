package com.authine.enums;

public enum PayState {
    before(0,"待支付"),after(1,"已支付");

    private   int code;
  private   String msg;

    PayState(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
