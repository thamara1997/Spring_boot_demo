package com.example.demo3.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    //save while checking first name
    public String addUser(User userData){
        if(userRepo.returnUser(userData.getFname()) == null){
            userRepo.save(userData);
            return "User added";
        }
        else{
            return "User exist";
        }
    }

    //get all users
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
