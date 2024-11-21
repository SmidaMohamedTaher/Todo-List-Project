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
    }
    
    public void edit(){

    }
    public void delete(){

    }
    public void markAsCompleted(){

    }
}
