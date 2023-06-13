package com.wjj.util;

import com.wjj.enums.CustomExceptionType;
import com.wjj.exception.CustomException;
import lombok.Data;


/**
 * @ClassName: AjaxResponse
 * @Author: lsc
 * @Date: 2023/03/28/14:43
 */
@Data
public class AjaxResponse {
    private int code;
    public String message;
    private Object data;
    private AjaxResponse(){

    }
    public static AjaxResponse error(CustomException e){
        AjaxResponse resultBean=new AjaxResponse();
        resultBean.setCode(e.getCode());
        resultBean.setMessage(e.getMessage());
        return resultBean;
    }
    public static AjaxResponse error(CustomExceptionType customExceptionType, String errorMessage){
        AjaxResponse resultBean=new AjaxResponse();
        resultBean.setCode(customExceptionType.getCode());
        resultBean.setMessage(errorMessage);
        return resultBean;
    }
    public static AjaxResponse success(){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }
    public static AjaxResponse success(Object obj){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
    public static AjaxResponse success(Object obj,String message){
        AjaxResponse ajaxResponse=new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage(message);
        ajaxResponse.setData(obj);
        return ajaxResponse;
    }
}
