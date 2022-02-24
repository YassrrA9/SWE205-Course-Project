package sample;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StartPage extends BorderPane {

    public StartPage(Stage primaryStage){
        Text SubjectText = new Text("         Welcome To \n Luxury Cars Company");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        Button LogInButton = new Button("Log in");
        Button SignUpButton = new Button("Sign up");
        LogInButton.setMaxWidth(120);
        SignUpButton.setMaxWidth(120);
        LogInButton.setPrefSize(90,30);
        SignUpButton.setPrefSize(90,30);
        LogInButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        SignUpButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));

        HBox SubjectBox = new HBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setSpacing(10);
        SubjectBox.setAlignment(Pos.CENTER);

        HBox ButtonsBox = new HBox();
        ButtonsBox.getChildren().addAll(LogInButton,SignUpButton);
        ButtonsBox.setSpacing(10);
        ButtonsBox.setAlignment(Pos.CENTER);

        FlowPane Pane = new FlowPane(Orientation.VERTICAL);
        Pane.getChildren().addAll(SubjectBox,ButtonsBox);
        Pane.setVgap(35);
        Pane.setAlignment(Pos.CENTER);

        setCenter(Pane);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));

        LogInButton.setOnAction(e ->{
            //To be Designed HERE
            LogInPage Obj = new LogInPage(primaryStage);
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        });

        SignUpButton.setOnAction( e ->{
            //To be Involved Sign Up page
            Registration Obj = new Registration(primaryStage);
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }
}
