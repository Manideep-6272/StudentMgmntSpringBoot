package com.example.studentmgnt.service;


import com.example.studentmgnt.entities.User;
import com.example.studentmgnt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepo;

    public boolean findUser(User user){
        User repoUser = userRepo.findByUsername(user.getUsername()).get();
        if (repoUser == null){
            return false;
        }
        return user.getPassword().equals(repoUser.getPassword());
    }

    public void register(User user){
        userRepo.save(user);
    }
}
