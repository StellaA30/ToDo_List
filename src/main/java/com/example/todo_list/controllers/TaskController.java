package com.example.todo_list.controllers;


import com.example.todo_list.models.Task;
import com.example.todo_list.models.TaskDTO;
import com.example.todo_list.models.User;
import com.example.todo_list.services.TaskService;
import com.example.todo_list.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping(value = "tasks")
public class TaskController {


    @Autowired
    TaskService taskService;

    @Autowired
    UserService userService;


    // post new task

    @PostMapping
    public ResponseEntity<Task> createNewTask(TaskDTO taskDTO){
        Task task = taskService.addNewTask(taskDTO);
        return new ResponseEntity<>(task, HttpStatus.CREATED);
    }

    // get specific task
    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> findTaskById(@PathVariable Long id){
        Optional<Task> task = taskService.getTaskById(id);
        if(task.isPresent()){
            return new ResponseEntity<>(task.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    // get all tasks/derived queries








    // delete task


    // update task


}
