package edu.isu.cs.cs2263;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button btnClick;

    @FXML
    void exitSystem(ActionEvent event) {
        System.exit(0);

    }

    @FXML
    void loadStudentList(ActionEvent event) {

    }

}
