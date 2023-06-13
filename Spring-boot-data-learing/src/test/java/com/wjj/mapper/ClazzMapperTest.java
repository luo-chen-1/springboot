package com.wjj.mapper;

import com.wjj.domain.Clazz;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
@SpringBootTest
class ClazzMapperTest {

    @Resource
    private ClazzMapper clazzMapper;

    @Test
    void selectOneToMany() {
        Clazz clazz = clazzMapper.selectOneToMany(1);
        System.out.println(clazz);
    }
}