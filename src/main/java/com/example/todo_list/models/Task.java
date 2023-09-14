package com.example.todo_list.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String task;

    @Column
    @Enumerated(EnumType.STRING)
    private Priority priority;

    @Column(name = "due_date")
    private LocalDate dueDate;

    @ManyToOne
    // add the nullable=false to ensure every chocolate must be associated to a non-null estate
    @JoinColumn(name="user_id")
    @JsonIgnoreProperties({"tasks"})
    private User user;


    public Task(String task, Priority priority, LocalDate dueDate, User user){
        this.task = task;
        this.priority = priority;
        this.dueDate = dueDate;
        this.user = user;
    }

    // default constructor
    public Task(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
