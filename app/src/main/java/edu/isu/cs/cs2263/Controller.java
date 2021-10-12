package edu.isu.cs.cs2263;
/**
 * @author David Hellwig
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

    @FXML private TableView<Student> studentTable;


    @FXML private TableColumn<Student, String> nameColumn;

    @FXML private TableView<Course> courseTable;

    @FXML private TableColumn<Course, String> courseColumn;

    /**
     *
     * @param event mouse click event
     */
    @FXML
    void exitSystem(ActionEvent event) {
        System.exit(0);

    }

    /**
     *
     * @param event mouse click even
     * @throws IOException throws io exception if json file is missing
     */
    @FXML
    void loadStudentList(ActionEvent event) throws IOException {

        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("firstName"));

        studentTable.setItems(getStudents());
    }

    /**
     *
     * @return returns list of students from json file
     * @throws IOException throws io exception when json file is missing
     */
    private ObservableList<Student> getStudents() throws IOException {

        IOManager ioManager = new IOManager();

        ObservableList<Student> students = FXCollections.observableArrayList(ioManager.readData());

        return students;
    }

    public void loadCourses(MouseEvent mouseEvent) throws IOException {
        courseColumn.setCellValueFactory(new PropertyValueFactory<Course, String>("subject"));

        courseTable.setItems(getCourses());

    }

    private ObservableList<Course> getCourses() throws IOException {
        IOManager ioManager = new IOManager();
        ObservableList<Student> students = FXCollections.observableArrayList(ioManager.readData());
        ObservableList<Course> courses = null;
        for (Student student : students){
            courses.add((Course) getCourses());
        }


        return courses;
    }
}
