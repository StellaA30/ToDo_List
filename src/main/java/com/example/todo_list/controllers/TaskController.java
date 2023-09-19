package com.example.todo_list.controllers;


import com.example.todo_list.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "tasks")
public class TaskController {


    @Autowired
    TaskService taskService;


}
