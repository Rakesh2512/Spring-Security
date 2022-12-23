package com.learn.Services;

import com.learn.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User>list = new ArrayList<>();

    public UserService() {
       list.add(new User("rakesh","25@rakesh","rakesh25@gmail.com,"));
       list.add(new User("vikash","25@vikash","vikash25@gmail.com,"));
    }

    // Get all user
    public List<User>getAlluser(){
        return this.list;
    }
    // get specific user
    public User getuser(String username){
        return this.list.stream().filter(user -> (user.getUsername().equals(username))).findAny().orElse(null);
    }
    // add detail
    public User adduser(User user){
        this.list.add(user);
        return user;
    }
}
