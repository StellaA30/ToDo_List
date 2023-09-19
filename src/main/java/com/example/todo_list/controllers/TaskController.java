package com.example.todo_list.controllers;


import com.example.todo_list.models.Task;
import com.example.todo_list.models.TaskDTO;
import com.example.todo_list.models.User;
import com.example.todo_list.services.TaskService;
import com.example.todo_list.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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


    }


    // get all tasks/derived queries

    // get specific task


    // delete task


    // update task


}
