package edu.isu.cs.cs2263;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Controller {

    @FXML
    private Button btnClick;

    @FXML
    private Button btnTwo;

    @FXML private TableView<Student> studentTable;

    @FXML private TableColumn<Student, String> nameColumn;

    @FXML private TableView<Course> courseTable;

    @FXML private TableColumn<Course, String> courseColumn;







    @FXML
    void exitSystem(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void loadStudentList(ActionEvent event) throws IOException {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("firstName"));




        studentTable.setItems(getStudents());


    }




    private ObservableList<Student> getStudents() throws IOException {
        IOManager ioManager = new IOManager();

        ObservableList<Student> students = FXCollections.observableArrayList(ioManager.readData());
        return students;
    }

    private void handleRowClick(MouseEvent mouseEvent, IndexedCell<Student> cell){
        if (cell.isSelected()){
            courseColumn.setCellValueFactory(new PropertyValueFactory<>("toString"));
        }
    }

    private ObservableList<Course> getCourse() throws IOException {
        ObservableList<Student> studentList = getStudents();
        for (Student element : studentList){
            ;
        }
    }

}
