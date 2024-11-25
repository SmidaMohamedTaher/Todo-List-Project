package com.example.mini_project.Classes;

import java.util.ArrayList;

public abstract class TaskList {

    public abstract void addTask(Task task);
    public abstract void deleteTask(Task task);
    public abstract void editTask(int idOfTask,Task task);
    public abstract void displayTasks();
    public abstract void sortByDate() ;
    public abstract ArrayList<Task> sherch(String word) ;

}
