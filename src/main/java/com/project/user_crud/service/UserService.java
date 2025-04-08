package com.project.user_crud.service;

import com.project.user_crud.entity.User;
import com.project.user_crud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public User getUserById(String userId){
        return userRepository.findById(userId).orElseThrow(()->new RuntimeException("user not found"));
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateUser(String userId,User user){
        User userDb = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("user not found"));
        userDb.setName(user.getName());
        userDb.setEmailAddress(user.getEmailAddress());
        return userRepository.save(userDb);
    }

    public String deleteUser(String userId){
        userRepository.deleteById(userId);
        return "user deleted successfully";
    }
}
