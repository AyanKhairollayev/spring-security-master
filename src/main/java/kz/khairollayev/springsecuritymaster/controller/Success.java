package kz.khairollayev.springsecuritymaster.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Success {
    @GetMapping("/success")
    public String success() {
        return "Hello, User!";
    }
}
