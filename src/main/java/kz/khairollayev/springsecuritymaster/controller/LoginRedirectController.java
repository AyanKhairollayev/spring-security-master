package kz.khairollayev.springsecuritymaster.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/afterLogin")
public class LoginRedirectController {
    @GetMapping("/success")
    @PreAuthorize("hasRole('USER')")
    public String success() {
        return "Hello, User!";
    }

    @GetMapping("/failure")
    public String failure() {
        return "Failed";
    }
}
