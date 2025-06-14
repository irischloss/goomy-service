package com.example.koki_service.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.koki_service.mapper.PersonMapper;

// 声明在koki_service中使用persondb数据源
@Service 

// 使用JDBC的版本，已经调通了
// public class PersonService{

//     private final JdbcTemplate personJdbcTemplate;

//     public PersonService(@Qualifier("personJdbcTemplate") JdbcTemplate jdbcTemplate){
//         this.personJdbcTemplate=jdbcTemplate;
//     }

//     public void saveperson(String name,String birthday){
//         String sql="INSERT INTO person (name,birthday) VALUES (?,?)";
//         personJdbcTemplate.update(sql,name,birthday);
//     }

//     public String findBirthdayByName(String name){
//         String sql="SELECT birthday FROM person WHERE name=?";
//         try{
//             return personJdbcTemplate.queryForObject(sql, new Object[]{name},String.class);
//         } catch (Exception e){
//             return "not found the name";
//         }
//     }
// }

public class PersonService{
    private final PersonMapper personMapper;

    public PersonService(PersonMapper personMapper){
        this.personMapper=personMapper;
    }

    public void saveperson(String name,String birthday){
        personMapper.insertPerson(name,birthday);
    }
    public String findBirthdayByName(String name){
        try{
            return personMapper.selectBirthdayByName(name);
        } catch(Exception e){
            return "Error,name not Found.";
        }
    }
}