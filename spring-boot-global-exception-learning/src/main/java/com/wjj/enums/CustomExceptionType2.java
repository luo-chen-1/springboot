package com.wjj.enums;

import com.wjj.consts.Consts;
import lombok.Getter;


/**
 * @ClassName: CustomExceptionType2
 * @Author: lsc
 * @Date: 2023/03/28/16:27
 */
@Getter
public enum CustomExceptionType2 {
    PARAM_ERROR(Consts.CODE_400,Consts.UNAUTHORIZED_ERROR),
    UNAUTHORIZED_ERROR(Consts.CODE_401,Consts.UNAUTHORIZED_ERROR),
    FORBIDDEN_ERROR(Consts.CODE_403,Consts.FORBIDDEN_ERROR),
    SYSTEM_ERROR(Consts.CODE_500,Consts.SYSTEM_ERROR),
    OTHER_ERROR(Consts.CODE_999,Consts.OTHER_ERROR);
    CustomExceptionType2(int code, String desc) {
        this.code=code;
        this.desc=desc;
    }
    private  final int code;
    private final String desc;

}
