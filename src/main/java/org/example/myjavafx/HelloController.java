package org.example.myjavafx;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Button copybtn;

    @FXML
    private Label display;

    @FXML
    private Button loginbtn;

    @FXML
    private TextField password;

    @FXML
    private Label promptuser;

    @FXML
    private TextArea textarea;

    @FXML
    private TextField username;

    @FXML
    void copy(ActionEvent event) {
        display.setText(textarea.getText());
    }

    @FXML
    void login(ActionEvent event) {
        if(username.getText().equals("admin")& password.getText().equals("1234")){
            promptuser.setText("valid details");
            promptuser.setTextFill(Color.GREEN);
        }
        else{
            promptuser.setText("invalid details");
            promptuser.setTextFill(Color.RED);
        }
    }

    @FXML
    void mouseEnter(MouseEvent event) {
        display.setText("mouse has entered this area");
    }

    @FXML
    void mouseExited(MouseEvent event) {
        display.setText("mouse has left this area");
    }

}
