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
import java.io.IOException;

public class CustomerPage extends BorderPane {

    public CustomerPage(Stage primaryStage){

        Text SubjectText = new Text("HomePage");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        SubjectText.setX(100);


        Button RentCarButton = new Button("Rent Car");
        Button CancelReservButton = new Button("Cancel Reservation");
        Button PreOrderButton = new Button("Pre Order");
        Button ReportProbButton = new Button("Report Problem");
        Button LogOutButton = new Button("Log Out");



        //RentCarButton.setMaxWidth(140);
        //CancelReservButton.setMaxWidth(140);
        //PreOrderButton.setMaxWidth(140);
        //ReportProbButton.setMaxWidth(140);
        //LogOutButton.setMaxWidth(140);
        //CancelReservButton.setMaxHeight(140);



        RentCarButton.setPrefSize(150,30);
        CancelReservButton.setPrefSize(150,30);
        PreOrderButton.setPrefSize(150,30);
        ReportProbButton.setPrefSize(150,30);
        LogOutButton.setPrefSize(120,30);


        RentCarButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        CancelReservButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        PreOrderButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        ReportProbButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        LogOutButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));

        VBox SubjectBox = new VBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setAlignment(Pos.CENTER);

        VBox MainButtonsBox = new VBox();
        MainButtonsBox.getChildren().addAll(RentCarButton,CancelReservButton,PreOrderButton,ReportProbButton);
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


        RentCarButton.setOnAction( e ->{
            RentCar Obj = null;
            try {
                Obj = new RentCar(primaryStage);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
        CancelReservButton.setOnAction( e ->{
                CancelReservationC Obj = new CancelReservationC(primaryStage);
                Scene scene = new Scene(Obj,400,500);
                primaryStage.setTitle("Hello World");
                primaryStage.setScene(scene);
                primaryStage.show();

        });PreOrderButton.setOnAction( e ->{
            PreOrder Obj = null;
            try {
                Obj = new PreOrder(primaryStage);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();

        });ReportProbButton.setOnAction( e ->{
            ReportProblem Obj = new ReportProblem(primaryStage);
            Scene scene = new Scene(Obj,400,500);
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(scene);
            primaryStage.show();
        });LogOutButton.setOnAction( e ->{
            primaryStage.getScene().setRoot(new StartPage(primaryStage));

        });
    }
}
