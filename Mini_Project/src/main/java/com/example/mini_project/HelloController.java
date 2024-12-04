package com.example.mini_project;

import com.example.mini_project.Classes.Task;
import com.example.mini_project.Classes.TaskImpl;
import com.example.mini_project.Classes.TaskList;
import com.example.mini_project.Classes.TaskListImpl;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("taskCreation.fxml"));
        HBox t = fxmlLoader.load() ;
        Label taskNameLable =  (Label) t.getChildren().get(0) ;
        Label TaskDiscriptionLabel =  (Label) t.getChildren().get(1) ;
        Label TaskDateLable =  (Label) t.getChildren().get(2) ;
        Button statusButtom =  (Button) t.getChildren().get(3) ;


        taskNameLable.setText(taskName.getText()) ;
        TaskDiscriptionLabel.setText(taskDescription.getText()) ;
        TaskDateLable.setText(taskDate.getValue().toString()) ;


        t.getChildren().clear();
        t.getChildren().add(taskNameLable) ;
        t.getChildren().add(TaskDiscriptionLabel) ;
        t.getChildren().add(TaskDateLable) ;
        t.getChildren().add(statusButtom) ;

        ListOfTaskes.getChildren().add( t );

    }

    @FXML
    protected void sherch(){
        ArrayList<Task> sherchingTasks = List.sherch(sherchWord.getText());
        ListOfTaskes.getChildren().clear();

    }

}