package sample;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.CheckingProgress;
import sample.CustomerPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileLockInterruptionException;
import java.util.ArrayList;
import java.util.Scanner;

public class RentCar extends BorderPane {
    private ComboBox<String> comboBox = new ComboBox<>();
    private ComboBox<String> comboBox2 = new ComboBox<>();
    private ComboBox<String> comboBox3 = new ComboBox<>();
    private ComboBox<String> comboBox4 = new ComboBox<>();
    private ComboBox<String> comboBox5 = new ComboBox<>();

    private ArrayList<Car> rentcar = new ArrayList<>();
    private ArrayList<String> reader= new ArrayList<>();
    private Car obj = new Car();
    private FileInputStream input;
    private Scanner sc;
    private ArrayList<String> a1 = new ArrayList<>();
    private ArrayList<String> a2 = new ArrayList<>();
    private ArrayList<String> a3 = new ArrayList<>();
    private ArrayList<String> a4 = new ArrayList<>();
    private ArrayList<String> a5 = new ArrayList<>();

    public RentCar() throws FileNotFoundException {}
    public RentCar(Stage primaryStage) throws FileNotFoundException {

        FileInputStream outputtype = new FileInputStream("type.txt");
         Scanner s1 = new Scanner(outputtype);
         FileInputStream outputname = new FileInputStream("name.txt");
         Scanner s2 = new Scanner(outputname);
         FileInputStream outputmodel = new FileInputStream("model.txt");
         Scanner s3 = new Scanner(outputmodel);
         FileInputStream outputsize = new FileInputStream("size.txt");
         Scanner s4 = new Scanner(outputsize);
         FileInputStream outputcolor = new FileInputStream("color.txt");
         Scanner s5 = new Scanner(outputcolor);
//_____________________ArrayList for BMW cars_________________
        while(s1.hasNextLine()) {
            a1.add(s1.nextLine());
        }


        while(s2.hasNextLine()) {
            a2.add(s2.nextLine());
        }

        while(s3.hasNextLine()) {
            a3.add(s3.nextLine());
        }

        while(s4.hasNextLine()) {
            a4.add(s4.nextLine());
        }

        while(s5.hasNextLine()) {
            a5.add(s5.nextLine());
        }
//_____________________ArrayList for TOYOTA cars_______________


//____________________ArrayList for Cadillac cars_______________



//_________________ArrayList for Aston Martin cars_______________



        comboBox.getItems().addAll(
                a1
        );
        comboBox.setValue(a1.get(0));
        comboBox2.getItems().addAll(a2);
        comboBox2.setValue(a2.get(0));

//______________Action to show each type of the cars______________
        comboBox.setOnAction(e -> {
            comboBox2.getItems().clear();

            System.out.println("hi");
            if (comboBox.getValue() == "BMW") {
                comboBox2.getItems().addAll(a2);
                comboBox2.setValue("Series 1");


            } else if (comboBox.getValue() == "TOYOTA") {
                comboBox2.getItems().addAll(a2);
                comboBox2.setValue("CAMRY");


            } else if (comboBox.getValue() == "CADILLAC") {
                comboBox2.getItems().addAll(a2);
                comboBox2.setValue("XT4");


            } else {
                comboBox2.getItems().addAll(a2);
                comboBox2.setValue("DB11");

            }

        });

//_________________________ComboBox for car model	_____________________
        comboBox3.getItems().addAll(
                a3
        );
        comboBox3.setValue(a3.get(0));

//_________________________ComboBox for car size_____________________
        comboBox4.getItems().addAll(
                a4
        );
        comboBox4.setValue(a4.get(0));

        Text SubjectText = new Text("Rent Car");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        SubjectText.setX(100);




//________________________GridPane to have all the nodes in x-y axis________________
        GridPane pane = new GridPane();
        pane.setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));

//_________________________Label for adding the car_____________________


//_________________________Label for car Type_______________________
        comboBox.setMaxWidth(100);
        Label l1 = new Label("Car Type");
        l1.setTextFill(Color.WHITE);
        l1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));




        comboBox2.setMaxWidth(100);
        comboBox2.setOnAction(e -> {
            if (comboBox.getValue() == a1.get(0)) {

            }
        });

//_________________________Label for car name_____________________
        Label l2 = new Label("Car Name");
        l2.setTextFill(Color.WHITE);
        l2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));

        //pane.add(l2, 1, 2);
        //pane.add(comboBox2, 2, 2);

//_________________________Label for car model_____________________
        comboBox3.setMaxWidth(100);
        Label l3 = new Label("Car Model");
        l3.setTextFill(Color.WHITE);
        l3.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));



//_________________________Label for car size_____________________
        comboBox4.setMaxWidth(100);
        Label l4 = new Label("Car Size");
        l4.setTextFill(Color.WHITE);
        l4.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));



//_________________________Button for to add and the car in the database_____________________
        Button b1 = new Button("Rent");
        b1.setMinWidth(60);
        b1.setMinHeight(10);
        b1.setStyle("-fx-font: 13 arial; -fx-base: lightblue");

        Button RentButton = new Button("Rent");
        Button ReturnButton = new Button("Return");
        RentButton.setMaxWidth(120);
        ReturnButton.setMaxWidth(120);
        RentButton.setPrefSize(90,30);
        ReturnButton.setPrefSize(90,30);
        RentButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
        ReturnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));

        HBox SubjectBox = new HBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setSpacing(10);
        SubjectBox.setAlignment(Pos.CENTER);


        VBox SubTextsBox = new VBox();
        SubTextsBox.getChildren().addAll(l1,l2,l3,l4);
        SubTextsBox.setAlignment(Pos.CENTER_LEFT);
        SubTextsBox.setSpacing(12);

        VBox ListBox = new VBox();
        ListBox.getChildren().addAll(comboBox,comboBox2,comboBox3,comboBox4);
        ListBox.setAlignment(Pos.CENTER_RIGHT);
        ListBox.setSpacing(7);

        FlowPane smallPane = new FlowPane(Orientation.HORIZONTAL);
        smallPane.getChildren().addAll(SubTextsBox,ListBox);
        smallPane.setHgap(12);
        smallPane.setAlignment(Pos.CENTER);

        HBox ButtonsBox = new HBox();
        ButtonsBox.getChildren().addAll(ReturnButton,RentButton);
        ButtonsBox.setAlignment(Pos.CENTER);
        ButtonsBox.setSpacing(10);

        FlowPane Pane = new FlowPane(Orientation.VERTICAL);
        Pane.getChildren().addAll(SubjectBox,smallPane,ButtonsBox);
        Pane.setAlignment(Pos.CENTER);
        Pane.setVgap(50);

        setCenter(Pane);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));



//________________________Action to rent a car______________________



        pane.add(b1, 2, 6);

//_____________________Button to return the user to the homepage______________
        Button homeButton = new Button("Home");
        homeButton.setMinWidth(60);
        homeButton.setMinHeight(10);
        homeButton.setStyle("-fx-font: 13 arial; -fx-base: white");
        pane.add(homeButton, 3, 13, 1, 1);

//_____________________Button to return the user to the previous page______________
        Button backButton = new Button("Back");
        backButton.setMinWidth(60);
        backButton.setMinHeight(10);
        backButton.setStyle("-fx-font: 13 arial; -fx-base: white");
        pane.add(backButton, 0, 13, 1, 1);



        RentButton.setOnAction( e ->{
            RentCar Obj = null;
            try {
                Obj = new RentCar();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
            CheckingProgress checkBox = new CheckingProgress(Obj);

        });

        ReturnButton.setOnAction( e ->{
            primaryStage.getScene().setRoot(new CustomerPage(primaryStage));

        });
    }
}
