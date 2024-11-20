package com.example.mini_project.Classes;

import java.util.ArrayList;

public class TaskListImpl extends TaskList{
    private ArrayList<TaskImpl> Tasks;
    public  boolean addTask(TaskImpl task){
       // MyDataBaseControler.add(task) ;
        return this.Tasks.add(task) ;
    }
    public boolean deleteTask(TaskImpl task){
       // MyDataBaseControler.delete(task) ;
        return this.Tasks.remove(task);
    }
    public void editTask(TaskImpl task){
        
    }
    public void displayTasks(){

    }
}
