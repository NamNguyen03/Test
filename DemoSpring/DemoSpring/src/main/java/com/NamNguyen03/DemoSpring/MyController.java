package com.NamNguyen03.DemoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class MyController {

    @GetMapping
    public String sayHello() {
        return "Hello Nam";
    }
}
