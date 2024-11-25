package com.example.mini_project.Classes;

import java.util.Date;

public interface Task  {

    public void edit(Task task) ;
   // public void delete() ;
    public void markAsCompleted() ;
    public void markAsAbandoned() ;
    public int getId_T() ;
    public Date getDueDate() ;
    public String getName() ;
    public String getDescription() ;
    public Complete getStatus() ;

}
