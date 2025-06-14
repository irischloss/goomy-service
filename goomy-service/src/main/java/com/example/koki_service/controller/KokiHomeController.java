package com.example.koki_service.controller;

import com.example.koki_service.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.koki_service.model.Person;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;


// 使用Map存在内存中的方法 已完成
// @RestController
// public class KokiHomeController{
//     private Map<String,String> birthdaymap=new HashMap<>();
//     @PostMapping("/birthdayperson")
//     public String saveperson(@RequestBody person person){
//         birthdaymap.put(person.getName(),person.getBirthday());
//         return "Saved: "+person.getName()+","+person.getBirthday();
//     }
//     @GetMapping("/birthday")
//         public String getBirthday(@RequestParam String name){
//             return birthdaymap.getOrDefault(name,"Not found.");
//         }

// }

//写入数据库，并且查询的方法，使用JdbcTemplate简化操作
//后面改造成与数据库交互使用Mybatis也是这个相同的接口逻辑
@RestController
@RequestMapping("/person")
public class KokiHomeController{
    @Autowired
    private PersonService personservice;

    @PostMapping("/save")
    // save name and birthday
    public Map<String,Object> saveperson(@RequestBody Map<String,String> body){
        String name=body.get("name");
        String birthday=body.get("birthday");
        personservice.saveperson(name,birthday);
        Map<String,Object> res=new HashMap<>();
        res.put("message","saved successfully");
        return res;
    }

    // get the birthday by name
    @GetMapping("/birthday")
    public Map<String,Object> getBirthdayByName(@RequestParam String name){
        String birthday=personservice.findBirthdayByName(name);
        Map<String,Object> res=new HashMap<>();
        if(birthday!=null){
            res.put("name",name);
            res.put("birthday",birthday);
        }else{
            res.put("error","Name not Found.");
        }
        return res;
    }
}
