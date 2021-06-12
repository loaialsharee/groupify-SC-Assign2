package com.example.demo.task;

import java.util.List;


public interface ITaskService {

    List<Task> getAllTasks();
    Task getTaskById(int taskId);
    void addTask(Task task);
    void updateTask(Task task, int taskId);
    void deleteTask(int taskId);
    List<Task> getTaskByDesc(String description);

}