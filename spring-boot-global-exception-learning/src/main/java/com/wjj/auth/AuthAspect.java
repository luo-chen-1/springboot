package com.wjj.auth;

import com.wjj.enums.CustomExceptionType;
import com.wjj.exception.CustomException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import java.lang.reflect.Method;

/**
 * @ClassName: AuthAspect
 * @Author: lsc
 * @Date: 2023/03/28/18:14
 */
@Aspect
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AuthAspect {
    @Around("@annotation(com.wjj.auth.CheckAuth)")
    public Object checkAuth(ProceedingJoinPoint point) throws Throwable{
        HttpServletRequest request = getHttpServletRequest();
        String token = request.getHeader("Authorization");
        if(token == null){
            throw new CustomException(CustomExceptionType.UNAUTHORIZED_ERROR);
        }
        //获取注解上的value
        MethodSignature signature= (MethodSignature)point.getSignature();
        Method method = signature.getMethod();
        CheckAuth annotation = method.getAnnotation(CheckAuth.class);
        String value = annotation.value();
        if(!value.equals(token)){
            throw new CustomException(CustomExceptionType.UNAUTHORIZED_ERROR);
        }
        return point.proceed();
    }
    private HttpServletRequest getHttpServletRequest(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) requestAttributes;
        assert attributes !=null;
        return attributes.getRequest();
    }
}
