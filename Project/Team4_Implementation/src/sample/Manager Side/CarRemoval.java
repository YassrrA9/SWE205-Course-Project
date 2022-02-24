package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;

public class CarRemoval extends BorderPane {

    public CarRemoval(){}
    public CarRemoval(Stage primaryStage){

        Text SubjectText = new Text("Car Removal");
        SubjectText.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));

        Button RemoveButton = new Button("Remove");
        Button ReturnButton = new Button("Return");
        RemoveButton.setMaxWidth(120);
        ReturnButton.setMaxWidth(120);
        RemoveButton.setPrefSize(70,30);
        ReturnButton.setPrefSize(70,30);
        RemoveButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        ReturnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));

        ArrayList<String> cars = new ArrayList<>();
        //To Test the ListView
        cars.add("YYY");
        cars.add("XXX");
        cars.add("YYY");
        cars.add("XXX");
        cars.add("YYY");
        cars.add("XXX");
        cars.add("YYY");
        cars.add("XXX");
        ObservableList<String> items = FXCollections.observableArrayList(cars);

        Text TextSub1 = new Text("Select car/s");
        TextSub1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        TextSub1.setFill(Color.WHITE);

        ListView<String> CarsList = new ListView<>(items);
        CarsList.setPrefSize(130, 130);
        CarsList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        CarsList.getSelectionModel().selectedItemProperty().addListener(ov -> {      System.out.println("Selected indices: "        + CarsList.getSelectionModel().getSelectedIndices());      System.out.println("Selected items: "        + CarsList.getSelectionModel().getSelectedItems());    });


        VBox SubjectBox = new VBox();
        SubjectBox.getChildren().add(SubjectText);
        SubjectBox.setAlignment(Pos.CENTER);

        VBox MainBox = new VBox();
        MainBox.getChildren().addAll(TextSub1, CarsList);
        MainBox.setAlignment(Pos.CENTER);
        MainBox.setSpacing(10);

        HBox ButtonsBox = new HBox();
        ButtonsBox.getChildren().addAll(ReturnButton, RemoveButton);
        ButtonsBox.setAlignment(Pos.CENTER);
        ButtonsBox.setSpacing(10);

        FlowPane Pane = new FlowPane(Orientation.VERTICAL);
        Pane.getChildren().addAll(SubjectBox,MainBox, ButtonsBox);
        Pane.setAlignment(Pos.CENTER);
        Pane.setVgap(40);

        setCenter(Pane);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));


        RemoveButton.setOnMouseClicked(e ->{
            //To be DESIGNED
            CarRemoval Obj = new CarRemoval();
            CheckingProgress checkBox = new CheckingProgress(Obj);
        });
        ReturnButton.setOnMouseClicked(e ->{
            //To be DESIGNED

        });

    }
}
