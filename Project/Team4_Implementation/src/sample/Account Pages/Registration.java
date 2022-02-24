package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.*;

public class Registration extends BorderPane {

    public Person person;
    private String name;
    private String email;
    private String password;
    private int id;
    public Registration(){}
    //public Registration(Stage primaryStage) {

      //  primaryStage.setTitle("Sign Up Window");
       // GridPane gridPane = registrationLayout();
       // addUIControls(gridPane);
       // Scene scene = new Scene(gridPane, 400, 500);
       // primaryStage.setScene(scene);
       // primaryStage.show();
    //}


    //public GridPane registrationLayout() {
      //  GridPane gridPane = new GridPane();
        //gridPane.setAlignment(Pos.CENTER);
        //gridPane.setPadding(new Insets(40, 40, 40, 40));
       // gridPane.setHgap(10);
       // gridPane.setVgap(10);
       // ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
       // columnOneConstraints.setHalignment(HPos.RIGHT);
       // ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
       // columnTwoConstrains.setHgrow(Priority.ALWAYS);
       // gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
       // gridPane.setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));
       // return gridPane;
    //}

    public Registration(Stage primaryStage){
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        ColumnConstraints columnOneConstraints = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(200,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        gridPane.setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));

        Label headerLabel = new Label("REGISTRATION");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        headerLabel.setTextFill(Color.WHITE);
        gridPane.add(headerLabel, 0,0,2,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(20, 0,20,0));

        // Add Name Label
        Label nameLabel = new Label("Full Name ");
        nameLabel.setTextFill(Color.WHITE);
        gridPane.add(nameLabel, 0,1);
        nameLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));


        // Add Name Text Field
        TextField nameField = new TextField();
        gridPane.add(nameField, 1,1);


        // Add Email Label
        Label emailLabel = new Label("Email ID   ");
        emailLabel.setTextFill(Color.WHITE);
        gridPane.add(emailLabel, 0, 2);
        emailLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));


        // Add Email Text Field
        TextField emailField = new TextField();
        gridPane.add(emailField, 1, 2);

        // Add Password Label
        Label passwordLabel = new Label("Password ");
        passwordLabel.setTextFill(Color.WHITE);
        gridPane.add(passwordLabel, 0, 3);
        passwordLabel.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));


        // Add Password Field
        PasswordField passwordField = new PasswordField();
        gridPane.add(passwordField, 1, 3);

        // Add Submit Button
        //Button submitButton = new Button("Sign Up");
        //submitButton.setPrefHeight(40);
        //submitButton.setDefaultButton(true);
        //submitButton.setPrefWidth(100);
        //gridPane.add(submitButton, 1, 4);
        //GridPane.setHalignment(submitButton, HPos.CENTER);

        // Add Return Button
        //Button returnButton = new Button("Return");
        //returnButton.setPrefHeight(40);
        //returnButton.setDefaultButton(true);
        //returnButton.setPrefWidth(100);
        //gridPane.add(returnButton,1,4);
        //GridPane.setHalignment(returnButton, HPos.LEFT);

        Button submitButton = new Button("Sign Up");
        Button returnButton = new Button("Return");
        submitButton.setMaxWidth(120);
        returnButton.setMaxWidth(120);
        submitButton.setPrefSize(70,30);
        returnButton.setPrefSize(60,30);
        submitButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        returnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));


        HBox ButtonsBox = new HBox();
        ButtonsBox.getChildren().addAll(returnButton,submitButton);
        ButtonsBox.setAlignment(Pos.CENTER);
        ButtonsBox.setSpacing(10);


        gridPane.add(ButtonsBox, 1, 4);
        GridPane.setHalignment(ButtonsBox, HPos.CENTER);
        //gridPane.add(returnButton,1,4);
        //GridPane.setHalignment(returnButton, HPos.LEFT);

        // Saving text fields onto variables
       ;

        setCenter(gridPane);

        submitButton.setOnAction(e ->{
             name = nameField.getText();
             email = emailField.getText();
             password = passwordField.getText();
             id = (int) ((Math.random()*9)+1);
             getId(id);
            try {
                person = new Person(name, email, password,id);
                File facultyInfo = new File("FacultyInformation.txt");
                PrintWriter pw = new PrintWriter(facultyInfo);
                pw.printf(person.toString());
                pw.close();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        });

        returnButton.setOnAction(e ->{
            primaryStage.getScene().setRoot(new StartPage(primaryStage));

        });

    }

    public void print() throws IOException {

        File facultyInfo = new File("FacultyInformation.txt");
        PrintWriter pw = new PrintWriter(facultyInfo);
        pw.printf(person.toString());
        pw.close();
    }

    //هنا سوالف الاليرت بوكس اللي شلتها من الستارت ميثود
    /*private void alert() {
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(nameField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your name");
                    return;
                }
                if(emailField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter your email id");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(), "Form Error!", "Please enter a password");
                    return;
                }
                else {
                    showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
                    System.out.println(1);


                }
            }
        });
    }
*/
    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
    public void getId(int id){
        Text GeneralText = new Text("Your ID is "+id);
        Button YesButton = new Button("Ok");
        //Button NoButton = new Button("No");
        YesButton.setMaxWidth(80);
        //NoButton.setMaxWidth(50);

        FlowPane n = new FlowPane(YesButton);
        n.setHgap(15);
        n.setAlignment(Pos.CENTER);
        n.setPadding(new Insets(20,20,20,20));


        FlowPane pn = new FlowPane(Orientation.VERTICAL);
        pn.getChildren().addAll(GeneralText);
        pn.setAlignment(Pos.CENTER);
        pn.setVgap(14);
        BorderPane pane = new BorderPane();
        pane.setCenter(pn);
        pane.setBottom(n);

        Scene SCENE1 = new Scene(pane,350,150);
        Stage s = new Stage();
        s.setScene(SCENE1);
        s.show();

        YesButton.setOnMouseClicked(e ->{
            //Chenged will happen here
            s.close();

        });
    }


}