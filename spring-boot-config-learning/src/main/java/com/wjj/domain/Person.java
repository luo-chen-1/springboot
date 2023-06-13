package com.wjj.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */

@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {

    private Integer id;

    private String name;

    private List<String> hobby;

    private String[] family;

    private Map map;

    private Pet pet;

}
