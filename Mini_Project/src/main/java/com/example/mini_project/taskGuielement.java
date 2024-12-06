package com.example.mini_project;

import com.example.mini_project.Classes.Task;
import com.example.mini_project.Classes.TaskListImpl;
import com.example.mini_project.DataBases.DataBaseControler;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class taskGuielement {


    @FXML
    HBox task_instance;
    @FXML
    private Label taskLabel;
    @FXML
    Label descriptionLable ;
    @FXML
    Label DateLable ;
    @FXML
    Button status ;
    @FXML
    Button deleteBu ;

    TaskListImpl list = new TaskListImpl(DataBaseControler.findAll()) ;

    @FXML
    protected void deleteTask() throws IOException {
        String name = taskLabel.getText();

        for (Task t : list.displayTasks()){
            if (t.getName().equals(name)) {
                list.deleteTask(t);
                break;
            }
        }

    }

    @FXML
    protected void editStatus() throws IOException {

        String name = taskLabel.getText();
        Task task = null;

        for (Task t : list.displayTasks()){
            if (t.getName().equals(name)) {
                task = t;
                break;
            }
        }

        if (status.getText().equals("not_complated")) {
            status.setText("complated");
            status.getStyleClass().clear();
            status.getStyleClass().add("complated-button");
            task.markAsCompleted();
        }
        else{
            if (status.getText().equals("complated")) {
                status.setText("abandoned");
                status.getStyleClass().clear();
                status.getStyleClass().add("Abandoned-button");
                task.markAsAbandoned();

            }
            else {
                status.setText("not_complated");
                status.getStyleClass().clear();
                status.getStyleClass().add("not-complited-button");
                task.markAsNotComplated();
            }


        }
        list.editTask(task.getId_T(), task);
    }

}
