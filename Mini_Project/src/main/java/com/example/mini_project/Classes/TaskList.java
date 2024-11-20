package com.example.mini_project.Classes;

public abstract class TaskList {

    public abstract boolean addTask(TaskImpl task);
    public abstract boolean deleteTask(TaskImpl task);
    public abstract void editTask(TaskImpl task);
    public abstract void displayTasks();

}
