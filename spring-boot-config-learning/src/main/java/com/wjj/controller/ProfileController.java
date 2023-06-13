package com.wjj.controller;

import com.wjj.config.DBConfig;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */
@RestController
@AllArgsConstructor
public class ProfileController {

    private final DBConfig dbConfig;

    @GetMapping("/show")
    public  String show(){
        return dbConfig.configure();
    }


}
