package com.example.nizar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));


        TableColumn<mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("name"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new mahasiswa(1, "nizar ali", "2210817310012"));
        tableView.getItems().add(
                new mahasiswa(2, "ucup kasmiri", "2210172200132"));
        tableView.getItems().add(
                new mahasiswa(3, "samiri", "2210817310022"));
        tableView.getItems().add(
                new mahasiswa(4, "musa", "2021839200012"));
        tableView.getItems().add(
                new mahasiswa(5, "lisa", "1930382009332"));
        tableView.getItems().add(
                new mahasiswa(6, "tasbihs", "1832140001212"));
        tableView.getItems().add(
                new mahasiswa(7, "utuh", "2210817310011"));
        tableView.getItems().add(
                new mahasiswa(8, "reza", "2210811210001"));
        tableView.getItems().add(
                new mahasiswa(9, "isana", "2100128001222"));
        tableView.getItems().add(
                new mahasiswa(10, "fani", "2312001281382"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}