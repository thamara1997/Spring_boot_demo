package com.example.demo3.user;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public String addUser(@RequestBody User userData){
        return userService.addUser(userData);
    }

    @GetMapping("getusers")
    public List<User> returnAll(){
        return userService.getAllUsers();
    }
}
