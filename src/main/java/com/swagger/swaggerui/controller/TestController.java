package com.swagger.swaggerui.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test1")
    public ResponseEntity<?> testController() {
        return ResponseEntity.ok("Test Controller 1");
    }

    @GetMapping("/test2")
    public ResponseEntity<String> testController2() {
        return new ResponseEntity<>("Test Controller 2", HttpStatus.OK);
    }

}
