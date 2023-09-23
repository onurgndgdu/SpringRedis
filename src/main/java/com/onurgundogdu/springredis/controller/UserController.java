package com.onurgundogdu.springredis.controller;

import com.onurgundogdu.springredis.model.User;
import com.onurgundogdu.springredis.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    public UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("{/id}")
    public User getUser(@PathVariable String id){
        return userService.getUser(id);
    }
    @DeleteMapping("{/id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }
}
