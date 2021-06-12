package com.example.demo.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "/api/v1/tasks")
public class TaskAPI {

    @Autowired
    ITaskService serviceRef;


    // returns all tasks in json
    @GetMapping
    public List<Task> getTasksAPI(){
        return serviceRef.getAllTasks();
    }

    // add a new request
    @PostMapping
    public void postTaskAPI(@RequestBody Task task){
        serviceRef.addTask(task);
    }

    // delete a request
    @DeleteMapping(path="{taskId}")
    public void deleteTaskAPI(@PathVariable("taskId") int taskId){
        serviceRef.deleteTask(taskId);
    }


}
