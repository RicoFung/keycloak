package com.example.client.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public Object hello() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", "true");
        result.put("data", "hello world!");
        return result;
    }

}
