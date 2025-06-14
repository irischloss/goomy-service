package com.example.watergunservice.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;

@RestController
@RequestMapping("/toolbox")
public class ToolBoxController {
    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/echo")
    public String echo(@RequestParam(value = "message", defaultValue = "Hello, World!") String message) {
        System.out.println(message);
        return "Echo: " + message;
    }

    @GetMapping("/multiply")
    public double mutliply(@RequestParam(value = "num1", defaultValue = "0") double num1,
            @RequestParam(value = "num1", defaultValue = "0") double num2) {
        double result = num1 * num2;
        System.out.println("Multiplying " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @GetMapping("/add")
    public double add(@RequestParam(value="num1",defaultValue="0") double num1,@RequestParam(value="num2",defaultValue="0") double num2){
        double res=num1+num2;
        System.out.println("add:"+num1+"+"+num2+"="+res);
        return res;
    }

    // 最好只在浏览器访问该接口
    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue="游客") String name)
    {
        return "你好,"+name+"!";
    }

    // practice post
    @PostMapping("/person")
    public String person(@RequestBody Map<String,String> body){
        String name=body.get("name");
        String birthday=body.get("birthday");
        return "name is:"+name+",birthday is:"+birthday;
    }

    @Async
    public CompletableFuture<String> performAsyncTask(String taskId) {
        try {
            // 模拟耗时操作
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 返回任务结果
        return CompletableFuture.completedFuture("Task " + taskId + " completed!");
    }
}