package com.example.mini_project;

import com.example.mini_project.Classes.Task;
import com.example.mini_project.Classes.TaskImpl;
import com.example.mini_project.DataBases.DataBaseControler;

import java.util.Date;

public class Msin {

    public static void main(String[] args) {
        Date d = new Date() ;
        d.setDate(20);
        d.setMonth(12);
        d.setYear(2022);
        Task task = new TaskImpl("test","this is test of data base" ,d) ;
        DataBaseControler.create(task);
    }
}
