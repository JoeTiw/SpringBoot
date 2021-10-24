package net.bhupin.demo.controller;
import net.bhupin.demo.model.User;
import net.bhupin.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class UserController {

    //create a rest API
    @Autowired  //user repository
    private UserRepository userRepository;
    @GetMapping("users")
    public List <User> getUser(){
        return this.userRepository.findAll();   //returns the lists of users to the clients
    }
}
