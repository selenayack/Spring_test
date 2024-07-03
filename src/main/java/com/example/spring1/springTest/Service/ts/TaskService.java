package com.example.spring1.springTest.Service.ts;

import com.example.spring1.springTest.Dto.TaskDTO;
import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.entity.Tasks;
import com.example.spring1.springTest.Repository.TasksRepo;
import com.example.spring1.springTest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {


    TaskDTO save(TaskDTO taskDTO);

    List<Tasks> getAllTasks();




}
