package com.example.demo1.controller;

import com.example.demo1.domain.TagMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TagMapService tagMapService;

    @GetMapping("/")
    public String testController(){
        tagMapService.testTagMap();
        return "hello";
    }
}
