package com.authine.exception;

import com.authine.enums.ExceptionMsg;

public class SellException extends RuntimeException {
    public SellException(ExceptionMsg exceptionMsg) {
        super(exceptionMsg.getMsg());
    }
}
