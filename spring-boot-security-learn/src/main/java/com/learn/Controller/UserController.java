package com.learn.Controller;


import com.learn.Services.UserService;
import com.learn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAlluser(){
        return this.userService.getAlluser();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable ("username") String username){
        return this.userService.getuser(username);
    }
    @PostMapping("/adduser")
    public User add(@RequestBody User user){
        this.userService.adduser(user);
        return user;
    }
}
