package com.example.demo.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;


@Controller
public class TaskController {

    @Autowired
    ITaskService serviceRef;

    @RequestMapping("/")
    public String getHomePage(Model model) {
        System.out.println("getting home page");
        model.addAttribute("successMsg", "Welcome! Ready to Be Productive?");

        return "Homepage";
    }

    @RequestMapping("/addNewTask")
    public String addNewTaskPage(Model model) {
        model.addAttribute("task",new Task());
        return "NewTask";
    }


    @RequestMapping("/addTaskDetails")
    public String addTaskDetails(@ModelAttribute("task") Task task, BindingResult result, Model model){

        if(result.hasErrors()){
            return "NewTask";
        }
        else{
            serviceRef.addTask(task);
            model.addAttribute("successMsg", "Data Inserted Successfully");
            return "Homepage";

        }
    }

    @RequestMapping("/getAllTasks")
    public String getTaskList(Model model) {
        List<Task> taskList = new ArrayList<Task>();
        taskList= serviceRef.getAllTasks();
        model.addAttribute("taskList",taskList);
        return "taskview";
    }

    @RequestMapping(value="/task", method=RequestMethod.GET)
    public String Task(Model model, @RequestParam("taskId") int taskId) {
        Task task  = serviceRef.getTaskById(taskId);
        System.out.println("Before view "+task);
        model.addAttribute("taskData",task);
        return "TaskOperation";
    }

    @RequestMapping("/updateTask")
    public String updateTask(Model model, @RequestParam("taskId") int taskId) {
        Task task = serviceRef.getTaskById(taskId);
        System.out.println("in update task "+task);
        model.addAttribute("taskDetails", task);
        return "updateTaskPage";
    }

    @RequestMapping("/updateTaskDetails")
    public String updateTaskDetail(@ModelAttribute("task") Task task, BindingResult result, Model model){

        if(result.hasErrors()){
            return "NewTask";
        }
        else{
            System.out.println(task);
            serviceRef.updateTask(task, task.getTaskId());
            model.addAttribute("successMsg", "Task Updated Successfully");

            return "Homepage";

        }
    }

    @RequestMapping("/toggleHighlight")
    public String toggleHighlight(Model model, @RequestParam("taskId") int taskId){

        Task task = serviceRef.getTaskById(taskId);

            if(task.getIsHighlighted() == null){
                task.setIsHighlighted("true");
            } else {
                task.setIsHighlighted(null);
            }
            serviceRef.updateTask(task, task.getTaskId());
            System.out.println("result is =>" + task.getIsHighlighted());
            model.addAttribute("successMsg", "Task Updated Successfully");

            return "Homepage";


    }

    @RequestMapping("/deleteTask")
    public String deleteTask(Model model, @RequestParam("taskId") int taskId) {
        System.out.println("in delete Emp"+taskId);
        serviceRef.deleteTask(taskId);
        model.addAttribute("successMsg", "Task Deleted Successfully");

        return "Homepage";
    }

}

