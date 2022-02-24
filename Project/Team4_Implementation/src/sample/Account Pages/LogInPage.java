package sample;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LogInPage extends BorderPane {

    public LogInPage(Stage primaryStage){

        Text SubjectText = new Text("Log In ");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        SubjectText.setX(100);

        Text TextSub1 = new Text("ID");
        Text TextSub2 = new Text("Password");
        TextSub1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        TextSub2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        TextSub1.setFill(Color.WHITE);
        TextSub2.setFill(Color.WHITE);
        TextField IDField = new TextField();
        PasswordField PasswordField = new PasswordField();

        Button LogInButton = new Button("Log in");
        Button ReturnButton = new Button("Return");
        LogInButton.setMaxWidth(120);
        ReturnButton.setMaxWidth(120);
        LogInButton.setPrefSize(90,30);
        ReturnButton.setPrefSize(90,30);
        LogInButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        ReturnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));


        HBox SubjectBox = new HBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setSpacing(10);
        SubjectBox.setAlignment(Pos.CENTER);

        VBox TextVBox = new VBox();
        TextVBox.getChildren().addAll(TextSub1,TextSub2);
        TextVBox.setAlignment(Pos.CENTER_LEFT);
        TextVBox.setSpacing(10);

        VBox FiledsVBox = new VBox();
        FiledsVBox.getChildren().addAll(IDField,PasswordField);
        FiledsVBox.setAlignment(Pos.CENTER_RIGHT);
        FiledsVBox.setSpacing(10);

        HBox ButtonsBox = new HBox();
        ButtonsBox.getChildren().addAll(ReturnButton, LogInButton);
        ButtonsBox.setAlignment(Pos.CENTER);
        ButtonsBox.setSpacing(10);


        FlowPane smallPane = new FlowPane(Orientation.HORIZONTAL);
        smallPane.setAlignment(Pos.CENTER);
        smallPane.getChildren().addAll(TextVBox, FiledsVBox);
        smallPane.setHgap(25);

        FlowPane Pane = new FlowPane(Orientation.VERTICAL);
        Pane.setAlignment(Pos.CENTER);
        Pane.getChildren().addAll(SubjectBox,smallPane, ButtonsBox);
        Pane.setVgap(80);

        setCenter(Pane);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));




        LogInButton.setOnAction( e -> {
            //To show User Page & Checking validty
            if ((IDField.getText().equals("01"))) {

                System.out.println("YES");
                ManagerPage Obj = new ManagerPage(primaryStage);
                Scene scene = new Scene(Obj, 400, 500);
                primaryStage.setTitle("Hello World");
                primaryStage.setScene(scene);
                primaryStage.show();
            } else {

                CustomerPage Obj = new CustomerPage(primaryStage);
                Scene scene = new Scene(Obj,400,500);
                primaryStage.setTitle("Hello World");
                primaryStage.setScene(scene);
                primaryStage.show();

            }
        });

        ReturnButton.setOnAction( e -> {
            primaryStage.getScene().setRoot(new StartPage(primaryStage));

        });
    }
}
