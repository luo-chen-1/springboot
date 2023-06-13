package com.wjj.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args){
        log.info("Application参数名称：{}",args.getOptionNames());
        log.info("Application参数值：{}",args.getOptionValues("age"));
        log.info("Application参数：{}", Arrays.toString(args.getSourceArgs()));
    }

}
