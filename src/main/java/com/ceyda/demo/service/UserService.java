package com.ceyda.demo.service;


import com.ceyda.demo.dto.request.UserRequest;
import com.ceyda.demo.dto.response.UserResponse;
import com.ceyda.demo.entity.User;
import com.ceyda.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
     private final UserRepository userRepository;


     public UserResponse createUser(UserRequest request){
       User user=new User();
       user.setUserName(request.getUserName());
       user.setPassword(request.getPassword());
       userRepository.save(user);
       UserResponse userResponse=new UserResponse();
       userResponse.setUserName(user.getUserName());
       userResponse.setMessage("Succesfully created.");
       return userResponse;
     }

     public List<User> findAllUser(){
         return userRepository.findAll();
     }

     public void deleteUser(long id){
        userRepository.deleteById(id);
     }
}
