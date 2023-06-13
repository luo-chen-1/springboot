package com.wjj.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author :wjj
 * @date : 2023/3/16
 * @Description :
 */


@Data
@Configuration
@PropertySource("classpath:aliyun-oss.properties")
@ConfigurationProperties(prefix = "aliyun-oss")
public class OssConfig {

    private String endpoint;

    private String bucket;

    private String dir;

    private  String host;

    private  String ak;

    private  String secret;


}
