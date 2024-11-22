package com.example.mini_project.Classes;

import java.util.ArrayList;

public abstract class TaskList {

    public abstract boolean addTask(TaskImpl task);
    public abstract boolean deleteTask(TaskImpl task);
    public abstract void editTask(int idOfTask,TaskImpl task);
    public abstract void displayTasks();
    public abstract void sortByDate() ;
    public abstract ArrayList<TaskImpl> sherch(String word) ;

}
