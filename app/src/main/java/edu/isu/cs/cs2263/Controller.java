package edu.isu.cs.cs2263;
/**
 * @author David Hellwig
 */

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.*;

import javafx.scene.input.MouseEvent;

import java.io.IOException;

/**
 * this class controls the GUI
 */
public class Controller {

    @FXML
    private Button btnClick;

    @FXML
    private Button btnTwo;

    @FXML
    private ListView<Student> studentList;

    @FXML
    private ListView<Course> courseList;





    /**
     * @param event mouse click event
     * This method exits the program
     */
    @FXML
    void exitSystem(ActionEvent event) {
        System.exit(0);

    }

    /**
     * @param event mouse click on load button
     * This method loads a list of students to the studentList list view
     */
    @FXML
    void loadStudentList(ActionEvent event) throws IOException {
        studentList.setItems(getStudents());




    }

    /**
     *
     * @return returns list of students from json file
     * @throws IOException throws io exception when json file is missing
     * This method returns a list of students from json data
     */
    private ObservableList<Student> getStudents() throws IOException {

        IOManager ioManager = new IOManager();

        ObservableList<Student> students = FXCollections.observableArrayList(ioManager.readData());

        return students;

    }

    /**
     * @param mouseEvent click on student
     * This method loads courses from a selected student
     */
    public void loadCourses(MouseEvent mouseEvent) {
        ObservableList<Student> studentObservableList = studentList.getSelectionModel().getSelectedItems();

        Student student = studentObservableList.get(0);

        ObservableList<Course> courseObservableList = FXCollections.observableArrayList(student.courses);

        courseList.setItems(courseObservableList);


    }


}

