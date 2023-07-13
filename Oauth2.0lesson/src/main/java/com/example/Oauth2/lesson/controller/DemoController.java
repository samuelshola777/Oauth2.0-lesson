package com.example.Oauth2.lesson.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class DemoController {

    @GetMapping("")
    public ResponseEntity<String> demoController(){
        return  ResponseEntity.ok()
    }

}
