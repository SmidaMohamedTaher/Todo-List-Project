package com.example.mini_project;

import com.example.mini_project.Classes.Complete;
import com.example.mini_project.Classes.Task;
import com.example.mini_project.Classes.TaskImpl;
import com.example.mini_project.DataBases.DataBaseControler;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Msin {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        // Parse the date string into a Date object
        String inputDate = "2024-11-29";
        Date date = formatter.parse(inputDate);

        Task task = new TaskImpl("test","this is test of data base" ,date) ;
        DataBaseControler.create(task);

        ArrayList<Task> t = DataBaseControler.findAll() ;

        for ( Task test : t ) {
            System.out.println(test.getName());
        }

        Task te = new TaskImpl(11,"tasssss","this is test of data base" ,date, Complete.not_complated) ;

        DataBaseControler.update(te);

    }
}
