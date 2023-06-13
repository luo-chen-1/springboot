package com.wjj.prop;

import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */

@Component
@Configuration//标注本类为配置类
@ConfigurationProperties(prefix = "my")//指定自定义配置文件的注入属性的前缀
@PropertySource("classpath:my.properties")//指定自定义配置文件的位置和名称
@Setter
@ToString
public class MyProperties {

    private String url;

    private String username;

    private String password;

}
