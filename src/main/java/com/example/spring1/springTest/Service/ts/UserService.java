package com.example.spring1.springTest.Service.ts;
import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.entity.User;
import com.example.spring1.springTest.Repository.UserRepo;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface UserService {

    UserDTO save(UserDTO userDTO);

    List<User> getAllUsers();


    User getUserById(String  id);




    }


