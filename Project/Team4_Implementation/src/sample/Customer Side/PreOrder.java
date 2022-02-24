package sample;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PreOrder extends BorderPane {

    private ArrayList<String> a2 = new ArrayList<>();
    private ArrayList<String> a5 = new ArrayList<>();

    public PreOrder(){}
    public PreOrder(Stage primaryStage) throws IOException {

        FileInputStream outputname = new FileInputStream("name.txt");
        Scanner s2 = new Scanner(outputname);
        FileInputStream outputcolor = new FileInputStream("color.txt");
        Scanner s5 = new Scanner(outputcolor);


        while(s2.hasNextLine()) {
            a2.add(s2.nextLine());
        }

        while(s5.hasNextLine()) {
            a5.add(s5.nextLine());
        }


        Text SubjectText = new Text("Pre-Order");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        SubjectText.setX(100);

        ComboBox<String> Colors_Box = new ComboBox<>();
        ComboBox<String> Dates_Box = new ComboBox<>();
        ComboBox<String> Cars_Box = new ComboBox<>();

        Cars_Box.getItems().addAll(a2);
        Colors_Box.getItems().addAll(a5);

        ArrayList<String> dateArray = new ArrayList<>();
        dateArray.add("1/5");
        dateArray.add("2/5");
        dateArray.add("3/5");
        dateArray.add("4/5");
        dateArray.add("5/5");
        dateArray.add("6/5");
        dateArray.add("7/5");
        dateArray.add("8/5");
        dateArray.add("9/5");
        dateArray.add("10/5");
        dateArray.add("11/5");
        dateArray.add("12/5");
        dateArray.add("13/5");
        dateArray.add("14/5");
        dateArray.add("15/5");
        dateArray.add("16/5");

        Dates_Box.getItems().addAll(dateArray);

        Text TextSub1 = new Text("Select a Car");
        //Text T3 = new Text("Expected Date to be offred");
        Text TextSub2 = new Text("Select a Color");
        Text TextSub3 = new Text("Duration");
        Text TextSub4 = new Text("Select a Date");
        TextSub1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        TextSub2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        TextSub3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        TextSub4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));

        TextField DurationField = new TextField();
        DurationField.setPromptText("XX hours e.x 02 ");
        TextSub1.setFill(Color.WHITE);
        //T3.setFill(Color.WHITE);
        TextSub2.setFill(Color.WHITE);
        TextSub3.setFill(Color.WHITE);
        TextSub4.setFill(Color.WHITE);

        Button PaymentButton = new Button("Primary Payment");
        Button ReturnButton = new Button("Return");
        PaymentButton.setMaxWidth(150);
        ReturnButton.setMaxWidth(140);
        PaymentButton.setPrefSize(140,30);
        ReturnButton.setPrefSize(140,30);
        PaymentButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        ReturnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));




        VBox TextsBox = new VBox();
        TextsBox.getChildren().addAll(TextSub1, TextSub2, TextSub3, TextSub4);
        TextsBox.setSpacing(15);
        TextsBox.setAlignment(Pos.CENTER_LEFT);

        VBox ComboBoxes = new VBox(Cars_Box,Colors_Box, DurationField,Dates_Box);
        ComboBoxes.setSpacing(7);
        ComboBoxes.setAlignment(Pos.CENTER_LEFT);

        //VBox Box3 = new VBox(TextSub3,DurationField);
        //Box3.setSpacing(7);
        //Box3.setAlignment(Pos.CENTER);

        //HBox Box4 = new HBox(TextSub4,Dates_Box);
        //Box4.setSpacing(7);
        //Box4.setAlignment(Pos.CENTER);


        VBox SubjectBox = new VBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setAlignment(Pos.CENTER);

        HBox PrimaryPane = new HBox();
        PrimaryPane.getChildren().addAll(ReturnButton, PaymentButton);
        PrimaryPane.setAlignment(Pos.CENTER);
        PrimaryPane.setSpacing(10);


        FlowPane Pane = new FlowPane(Orientation.HORIZONTAL);
        Pane.setAlignment(Pos.CENTER);
        Pane.getChildren().addAll(TextsBox, ComboBoxes);
        Pane.setHgap(25);

        FlowPane pane2 = new FlowPane(Orientation.VERTICAL);
        pane2.setAlignment(Pos.CENTER);
        pane2.getChildren().addAll(SubjectBox, Pane,PrimaryPane);
        pane2.setVgap(80);


        //BorderPane GeneralPane = new BorderPane();
        //setTop(SubjectBox);
        setCenter(pane2);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));


        PaymentButton.setOnMouseClicked(e ->{
            //Confirmation Box to be Added Here
            PreOrder Obj = new PreOrder();
            CheckingProgress check = new CheckingProgress(Obj);
        });

        ReturnButton.setOnMouseClicked(e ->{
            //ReturnButton to HomePage
            primaryStage.getScene().setRoot(new CustomerPage(primaryStage));

        });





    }
}