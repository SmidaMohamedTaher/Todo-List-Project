package com.example.mini_project.Classes;

import java.util.ArrayList;
import java.util.Comparator;

public class TaskListImpl extends TaskList{
    private ArrayList<TaskImpl> tasks;

    public  boolean addTask(TaskImpl task){
       // MyDataBaseControler.add(task) ;
        return this.tasks.add(task) ;
        // push the tasks from database
    }

    public boolean deleteTask(TaskImpl task){
       // MyDataBaseControler.delete(task) ;
        return this.tasks.remove(task);
    }


    public void editTask(int idOfTask ,TaskImpl task){
        for (TaskImpl task1 : this.tasks) {
            if (task1.getId_T() == idOfTask) {
                task1.edit(task);
            }
        }
    }

    public void displayTasks(){

    }

    public void sortByDate(){
        this.tasks.sort(Comparator.comparing(item -> item.getDueDate()));
    }

    public ArrayList<TaskImpl> sherch(String word){
        ArrayList<TaskImpl> Findtasks = new ArrayList<>();
        for (TaskImpl task : this.tasks) {
            if (task.getName().contains(word) || task.getDescription().contains(word)) {
                Findtasks.add(task);
            }
        }
        
        return Findtasks;
    }
}
