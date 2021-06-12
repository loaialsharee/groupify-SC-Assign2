package com.example.demo.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private int taskId;
    private String taskName;
    private String description;
    private String isHighlighted;

    public Task() {}

    public Task(int taskId, String taskName, String description, String isHighlighted) {
        super();
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.isHighlighted = isHighlighted;
    }
    public int getTaskId() {
        return taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsHighlighted() { return isHighlighted; }
    public void setIsHighlighted(String isHighlighted) {
        this.isHighlighted = isHighlighted;
    }

    @Override
    public String toString() {
        return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", isHighlighted=" + isHighlighted + "]";
    }


}
