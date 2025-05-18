package com.example.koki_service.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.koki_service.model.Person;

@Mapper
public interface PersonMapper {
    void insertPerson(@Param("name") String name, @Param("birthday") String birthday);
    String selectBirthdayByName(@Param("name") String name);
}
