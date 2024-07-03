package com.example.spring1.springTest.controller;


import com.example.spring1.springTest.Dto.TaskDTO;
import com.example.spring1.springTest.Dto.UserDTO;
import com.example.spring1.springTest.Service.ts.UserService;
import com.example.spring1.springTest.entity.Tasks;
import com.example.spring1.springTest.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.spring1.springTest.Service.ts.TaskService;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {


    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    @PostMapping("/save")
    public ResponseEntity<TaskDTO> createUser(@RequestBody TaskDTO taskDTO) {

        return ResponseEntity.ok(taskService.save(taskDTO));

    }
    @GetMapping("/getAllTask")
    public ResponseEntity<List<Tasks>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }


}
