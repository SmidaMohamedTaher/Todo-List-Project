package com.example.mini_project.Classes;

import java.util.Date;

public interface Task  {

    /**
     * this fanction to edit the information of one tash
     * @param task
     */
    public void edit(Task task) ;

    /**
     * this fanction to mack the task as Complated
     */
    public void markAsCompleted() ;

    /**
     * this fanction to mack the task as A
     */
    public void markAsAbandoned() ;
    public int getId_T() ;
    public Date getDueDate() ;
    public String getName() ;
    public String getDescription() ;
    public Complete getStatus() ;

}
