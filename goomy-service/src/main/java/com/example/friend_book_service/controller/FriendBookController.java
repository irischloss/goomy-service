package com.example.friend_book_service.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.friend_book_service.service.FriendService;

@RestController
@RequestMapping("/editdb")
public class FriendBookController {
    @Autowired
    private FriendService friend_service;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/getbirthdaybylastname")
    public String getBirthdayBySecondName(
            @RequestParam(value = "last_name", defaultValue = "pig") String last_name) {
        System.out.println(last_name);
        return friend_service.getFriendBySecondName(last_name).toString();
    }

    @GetMapping("/addfriend")
    public String addFriend(
            @RequestParam(value = "first_name", defaultValue = "pig") String first_name,
            @RequestParam(value = "last_name", defaultValue = "pig") String last_name,
            @RequestParam(value = "birthday", defaultValue = "1949-01-01") String birthday) {
        System.out.println(last_name);
        if (friend_service.addFriend(first_name, last_name, birthday) > 0) {
            return "Success";
        } else {
            return "Failed";
        }
    }

    @GetMapping("/getelements")
    public String getelements(@RequestParam(value = "message", defaultValue = "Hello, World!") String message) {
        System.out.println(message);
        return "Echo: " + message;
    }
}