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

import java.io.FileNotFoundException;

public class ManagerPage extends BorderPane {

    public ManagerPage(Stage primaryStage){

        Text SubjectText = new Text("HomePage");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        SubjectText.setX(100);

        Button AddCarButton = new Button("Add Car");
        Button CancelReservButton = new Button("Cancel Reservation");
        Button RemoveCarButton = new Button("Remove Car");
        Button LogOutButton = new Button("Log Out");


        AddCarButton.setPrefSize(150,30);
        CancelReservButton.setPrefSize(150,30);
        RemoveCarButton.setPrefSize(150,30);
        LogOutButton.setPrefSize(120,30);


        AddCarButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        CancelReservButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        RemoveCarButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        LogOutButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));


        VBox SubjectBox = new VBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setAlignment(Pos.CENTER);

        VBox MainButtonsBox = new VBox();
        MainButtonsBox.getChildren().addAll(AddCarButton,CancelReservButton,RemoveCarButton);
        MainButtonsBox.setAlignment(Pos.CENTER);
        MainButtonsBox.setSpacing(10);

        VBox LogOutBox = new VBox();
        LogOutBox.getChildren().add(LogOutButton);
        LogOutBox.setAlignment(Pos.CENTER);

        FlowPane Pane = new FlowPane(Orientation.VERTICAL);
        Pane.getChildren().addAll(SubjectBox,MainButtonsBox,LogOutBox);
        Pane.setAlignment(Pos.CENTER);
        Pane.setVgap(40);

        setCenter(Pane);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));


        AddCarButton.setOnAction( e ->{
            AddCar Obj = null;
            try {
                Obj = new AddCar(primaryStage);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
        CancelReservButton.setOnAction( e ->{
            CancelReservationM Obj = new CancelReservationM(primaryStage);
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();

        });
        RemoveCarButton.setOnAction( e ->{
            //AddCar Obj = new AddCar(primaryStage);
            //Scene scene = new Scene(Obj,400,500);
            //primaryStage.setTitle("Hello World");
            //primaryStage.setScene(scene);
            //primaryStage.show();

        });
        LogOutButton.setOnAction( e ->{
            primaryStage.getScene().setRoot(new StartPage(primaryStage));

        });
    }
}
