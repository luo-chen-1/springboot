package com.wjj.mapper;

import com.wjj.domain.Clazz;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
public interface ClazzMapper {

 Clazz selectOneToMany(int clazzId);

}
