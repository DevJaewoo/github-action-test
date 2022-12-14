package com.devjaewoo.githubactiontest.controller;

import com.devjaewoo.githubactiontest.entity.User;
import com.devjaewoo.githubactiontest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/join")
    public String join(@RequestParam String name) {
        User user = new User(name);
        Long id = userService.join(user);
        return "Success! ID: " + id;
    }
}
