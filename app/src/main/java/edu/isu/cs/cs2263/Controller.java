package edu.isu.cs.cs2263;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class Controller {

    @FXML
    private Button btnClick;

    @FXML
    private Button btnTwo;

    @FXML private TableView<Student> studentTable;

    @FXML private TableColumn<Student, String> nameColumn;





    @FXML
    void exitSystem(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void loadStudentList(ActionEvent event) throws IOException {
        initialize();

    }

    public void initialize () throws IOException {
        nameColumn.setCellValueFactory(new PropertyValueFactory<Student, String>("firstName"));



        studentTable.setItems(getStudents());
    }

    private ObservableList<Student> getStudents() throws IOException {
        IOManager ioManager = new IOManager();

        ObservableList<Student> students = FXCollections.observableArrayList(ioManager.readData());
        return students;
    }

}
