package com.example.spring1.springTest.Service.Impl;


import com.example.spring1.springTest.Dto.TaskDTO;
import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.Repository.TasksRepo;
import com.example.spring1.springTest.Repository.UserRepo;
import com.example.spring1.springTest.Service.ts.TaskService;
import com.example.spring1.springTest.entity.Tasks;
import com.example.spring1.springTest.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {

    private final TasksRepo  tasksRepo;

    public TaskServiceImpl(TasksRepo  tasksRepo){
        this.tasksRepo=tasksRepo;
    }






    @Override
    public TaskDTO save(TaskDTO taskDTO) {

        Tasks tasks= new Tasks();
        tasks.setTaskDescription(taskDTO.getTaskDescription());
        tasks.setTaskId(taskDTO.getTaskId());
        tasks.setUser(taskDTO.getUser());
        tasks.setVehicle(taskDTO.getVehicle());
        Tasks tasks1 = tasksRepo.save(tasks);
        taskDTO.setTaskId(tasks1.getTaskId());
        taskDTO.setTaskDescription(tasks1.getTaskDescription());

        return  taskDTO;

    }

    @Override
    public List<Tasks> getAllTasks() {
        return tasksRepo.findAll();
    }
}
