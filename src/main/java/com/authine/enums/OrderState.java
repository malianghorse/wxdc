package com.authine.enums;

public enum OrderState {
    ToBeComfirm(0,"待确认"),Comfirm(1,"已确认"),Console(2,"取消"),Finishe(3,"完成");
    private   int code;
    private   String msg;

    OrderState(int code, String msg) {
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
