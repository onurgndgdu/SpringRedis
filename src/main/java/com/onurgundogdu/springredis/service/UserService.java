package com.onurgundogdu.springredis.service;

import com.onurgundogdu.springredis.model.User;
import com.onurgundogdu.springredis.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User getUser(String id){
        return userRepository.findById(id).orElse(null);
    }
    public void deleteUser(String id){
         userRepository.deleteById(id);
    }
}
