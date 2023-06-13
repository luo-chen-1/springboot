package com.wjj.exception;


import com.wjj.enums.CustomExceptionType;

/**
 * @ClassName: CustomException
 * @Author: lsc
 * @Date: 2023/03/28/14:38
 */

public class CustomException  extends  RuntimeException{
    private int code;
    private String message;
    private CustomException(){

    }
    public CustomException(CustomExceptionType customExceptionType){
        this.code = customExceptionType.getCode();
        this.message = customExceptionType.getDesc();
    }
    public CustomException(CustomExceptionType customExceptionType,String message){
        this.code = customExceptionType.getCode();
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
