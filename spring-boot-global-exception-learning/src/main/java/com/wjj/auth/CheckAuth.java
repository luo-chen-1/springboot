package com.wjj.auth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author :wjj
 * @date : 2023/3/28
 * @Description :
 */
//运行时
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuth {
    String value();
}
