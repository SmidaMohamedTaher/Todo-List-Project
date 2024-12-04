package com.example.mini_project.Classes;

import com.example.mini_project.DataBases.DataBaseControler;

import java.util.ArrayList;
import java.util.Comparator;

public class TaskListImpl extends TaskList{

    private ArrayList<Task> tasks;

    public TaskListImpl() {
        this.tasks = new ArrayList<Task>();
    }

    public  void addTask(Task task){
        DataBaseControler.create(task) ;
        update();
    }

    public void deleteTask(Task task){
       DataBaseControler.deleteById(task.getId_T());
       update();
    }

    public void editTask(int idOfTask ,Task task){
        for (Task task1 : this.tasks) {
            if (task1.getId_T() == idOfTask) {
                task1.edit(task);
                DataBaseControler.update(task1);
                update();
                break;
            }
        }
    }

    public void displayTasks(){

    }

    public void sortByDate(){
        this.tasks.sort(Comparator.comparing(item -> item.getDueDate()));
    }

    public ArrayList<Task> sherch(String word){
        ArrayList<Task> Findtasks = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.getName().contains(word) || task.getDescription().contains(word)) {
                Findtasks.add(task);
            }
        }
        
        return Findtasks;
    }

    public void update(){
        this.tasks.removeAll(this.tasks);
        this.tasks = DataBaseControler.findAll() ;
        sortByDate();

    }
}
