package com.lencho.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-30 22:43
 */
@Mapper
public interface StudentMapper {

    public List<Map> queryAll();
}
