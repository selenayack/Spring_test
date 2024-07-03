package com.example.spring1.springTest.Service.Impl;

import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.EmailService;
import com.example.spring1.springTest.Repository.UserRepo;
import com.example.spring1.springTest.Service.ts.UserService;
import com.example.spring1.springTest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final EmailService emailService;

    @Autowired
    public UserServiceImpl(UserRepo userRepo, EmailService emailService){
        this.userRepo = userRepo;
        this.emailService = emailService;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setUserEmail(userDTO.getUserEmail());
        user.setUserId(userDTO.getUserId());
        userRepo.save(user);
        emailService.sendEmail(userDTO.getUserEmail(), "Kayıt Başarılı", "Merhaba " + userDTO.getUserName() + ", kaydınız başarılı bir şekilde tamamlandı!");

        return userDTO;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepo.findById(id).orElse(null);
    }
}


