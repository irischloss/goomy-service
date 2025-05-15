package com.example.water_gun_service.controller;

import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
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