package com.example.mini_project.Classes;

import java.util.Date;

public class TaskImpl implements Task{
    private int id_T ;
    private String name ;
    private String description ;
    private Date dueDate ;
    private Complete status;

    public TaskImpl(int id_T, String name, String description, Date dueDate) {
        this.id_T = id_T ;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate ;
        this.status = Complete.not_complated ;
    }

    public void edit(TaskImpl task) {
        this.name = task.name;
        this.description = task.description;
        this.dueDate = task.dueDate;

    }
//    public void delete(){
//
//    }
    public void markAsCompleted(){
        this.status = Complete.complated ;
    }

    public void markAsAbandoned(){
        this.status = Complete.abandoned ;
    }

    public int getId_T() {
        return this.id_T;
    }
    public Date getDueDate() {
        return this.dueDate;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
