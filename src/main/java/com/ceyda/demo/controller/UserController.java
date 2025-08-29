package com.ceyda.demo.controller;


import com.ceyda.demo.dto.request.UserRequest;
import com.ceyda.demo.dto.response.UserResponse;
import com.ceyda.demo.entity.User;
import com.ceyda.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

       @PostMapping("/create")
    public UserResponse createUser(@RequestBody UserRequest request) {
           return userService.createUser(request);
       }
        @GetMapping("/list")
       public List<User> findAllUser(){ return userService.findAllUser();}

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id){
           userService.deleteUser(id);
    }







}
