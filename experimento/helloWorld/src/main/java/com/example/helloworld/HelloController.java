package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse sayHello(@RequestParam(name = "name", defaultValue = "World")String name) {
        return new HelloResponse("Hello " + name + "!");
    }

    @GetMapping("/world")
    public List<HelloResponse> sayHello2() {
        return List.of(new HelloResponse("Hello"), new HelloResponse("World!"));
    }
}