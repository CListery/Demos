package com.mcxtzhang.rxjava2demo.retrofit.base;

public class ResultException extends RuntimeException {

    private String errCode = "-1";

    public ResultException(String errCode, String msg) {
        super(msg);
        this.errCode = errCode;
    }

    public String getErrCode() {
        return errCode;
    }

    @Override
    public String toString() {

        return "ResultException{" + super.toString() +
                "errCode='" + errCode + '\'' +
                '}';
    }
}