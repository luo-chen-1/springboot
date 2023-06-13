package com.wjj.interceptor;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    private  final String[] excludePath = {"/css/**","/images/**","/api/login"};

    @Resource
    private AuthInterceptor authInterceptor;

    @Resource
    private CustomHandlerInterceptor customHandlerInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(customHandlerInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);
//        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns(excludePath);

    }
}
