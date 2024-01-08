package com.practice;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RestMapper {
    @Insert("INSERT INTO `search` VALUES (#{가맹점명}, #{시군구명}, 1)" +
            "ON DUPLICATE KEY UPDATE `count` = `count` + 1")
    void insert_store(RestDTO restDTO);
}
