package de.neuefische.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")

public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/hello")
    public String helloPost(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PutMapping("/hello")
    public String helloPut(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @DeleteMapping("/hello")
    public String helloDelete(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }




}
