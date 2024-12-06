package com.example.mini_project;

import com.example.mini_project.Classes.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private VBox ListOfTaskes ;
    @FXML
    private TextField taskName ;
    @FXML
    private TextArea taskDescription ;
    @FXML
    private TextField sherchWord ;
    @FXML
    private DatePicker taskDate ;

    TaskList List = new TaskListImpl() ;


    @FXML
    protected void addTask() throws IOException {
        if (taskName != null && taskDescription != null)
        List.addTask(new TaskImpl(taskName.getText(), taskDescription.getText(), Date.from(taskDate.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant())));

        ListOfTaskes.getChildren().clear();
        displayAllTasks();

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("taskCreation.fxml"));
//        HBox t = fxmlLoader.load() ;
//        Label taskNameLable =  (Label) t.getChildren().get(0) ;
//        Label TaskDiscriptionLabel =  (Label) t.getChildren().get(1) ;
//        Label TaskDateLable =  (Label) t.getChildren().get(2) ;
//        Button statusButtom =  (Button) t.getChildren().get(3) ;
//
//
//        taskNameLable.setText(taskName.getText()) ;
//        TaskDiscriptionLabel.setText(taskDescription.getText()) ;
//        TaskDateLable.setText(taskDate.getValue().toString()) ;
//
//
//        t.getChildren().clear();
//        t.getChildren().add(taskNameLable) ;
//        t.getChildren().add(TaskDiscriptionLabel) ;
//        t.getChildren().add(TaskDateLable) ;
//        t.getChildren().add(statusButtom) ;
//
//        ListOfTaskes.getChildren().add( t );

    }

    /**
     * this methode well add HBox with task data to the List of Tasks in interface
     */
    private void addHBox(String nameOfTask , String discriptionOfTask , Date dateOfTask , Complete status)  throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("taskCreation.fxml"));
        HBox t = fxmlLoader.load() ;
        Label taskNameLable =  (Label) t.getChildren().get(0) ;
        Label TaskDiscriptionLabel =  (Label) t.getChildren().get(1) ;
        Label TaskDateLable =  (Label) t.getChildren().get(2) ;
        Button statusButtom =  (Button) t.getChildren().get(3) ;


        taskNameLable.setText(nameOfTask) ;
        TaskDiscriptionLabel.setText(discriptionOfTask) ;
        TaskDateLable.setText(dateOfTask.toString()) ;
        statusButtom.setText(status.toString()) ;


        t.getChildren().clear();
        t.getChildren().add(taskNameLable) ;
        t.getChildren().add(TaskDiscriptionLabel) ;
        t.getChildren().add(TaskDateLable) ;
        t.getChildren().add(statusButtom) ;

        ListOfTaskes.getChildren().add( t );
    }

    private void displayAllTasks() throws IOException {
        ListOfTaskes.getChildren().clear();
        for (Task task : List.displayTasks()){
            addHBox(task.getName(),task.getDescription(),task.getDueDate(),task.getStatus());
        }
    }




//    @FXML
//    protected void sherch(){
//        ArrayList<Task> sherchingTasks = List.sherch(sherchWord.getText());
//        ListOfTaskes.getChildren().clear();
//
//    }

}