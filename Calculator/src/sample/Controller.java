package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private Button addBtn;

    @FXML
    private Button divBtn;

    @FXML
    private Button mulBtn;

    @FXML
    private Button subBtn;


    @FXML
    private Button tanBtn;

    @FXML
    private Button sinBtn;

    @FXML
    private Button cosBtn;

    @FXML
    private Button exBtn;

    @FXML
    private Label ansLbl;

    @FXML
    void add(ActionEvent event) {
        String A1 = text1.getText();
        String A2 = text2.getText();

        double x = Double.parseDouble(A1);
        double y = Double.parseDouble(A2);

        double z = 0;

        if(event.getSource()==addBtn){

            z = x+y;

        }
        String output = String.valueOf(z);
        ansLbl.setText("The addition is : "+output);
    }
    @FXML
    void sub(ActionEvent event) {
        String A1 = text1.getText();
        String A2 = text2.getText();

        double x = Double.parseDouble(A1);
        double y = Double.parseDouble(A2);

        double z = 0;

        if(event.getSource()==subBtn){

            z = x-y;

        }
        String output = String.valueOf(z);
        ansLbl.setText("The subtraction is : "+output);
    }

    @FXML
    void mul(ActionEvent event) {
        String A1 = text1.getText();
        String A2 = text2.getText();

        double x = Double.parseDouble(A1);
        double y = Double.parseDouble(A2);

        double z = 0;

        if(event.getSource()==mulBtn){

            z = x*y;

        }
        String output = String.valueOf(z);
        ansLbl.setText("The multiplication is : "+output);
    }

    @FXML
    void div(ActionEvent event) {
        String A1 = text1.getText();
        String A2 = text2.getText();

        double x = Double.parseDouble(A1);
        double y = Double.parseDouble(A2);

        double z = 0;

        if(event.getSource()==divBtn){

            z = x/y;

        }
        String output = String.valueOf(z);
        ansLbl.setText("The division is : "+output);
    }

    @FXML
    void cos(ActionEvent event) {
        String A1 = text1.getText();

        double degrees = Double.parseDouble(A1);
        double rad = Math.toRadians(degrees);
        double cosVal = Math.cos(rad);

        String output = String.valueOf(cosVal);
        ansLbl.setText(output);

    }

    @FXML
    void exp(ActionEvent event) {
        String A1 = text1.getText();

        double power = Double.parseDouble(A1);
        double expo = Math.exp(power);

        String output = String.valueOf(expo);
        ansLbl.setText(output);
    }

    @FXML
    void sin(ActionEvent event) {
        String A1 = text1.getText();

        double degrees = Double.parseDouble(A1);
        double rad = Math.toRadians(degrees);
        double sinVal = Math.sin(rad);

        String output = String.valueOf(sinVal);
        ansLbl.setText(output);
    }

    @FXML
    void tan(ActionEvent event) {
        String A1 = text1.getText();

        double degrees = Double.parseDouble(A1);
        double rad = Math.toRadians(degrees);
        double tanVal = Math.tan(rad);

        String output = String.valueOf(tanVal);
        ansLbl.setText(output);


    }

    @FXML
    void initialize() {

    }
}

