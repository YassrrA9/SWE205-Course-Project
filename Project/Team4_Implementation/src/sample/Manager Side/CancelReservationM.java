package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Reservation;

import java.util.ArrayList;

public class CancelReservationM extends BorderPane {

    Reservation reservations = new Reservation();

    public CancelReservationM() {
    }

    public CancelReservationM(Stage primaryStage) {


        GridPane gridPane = registrationLayout();
        Label header = new Label("CURRENT RESERVATIONS");
        header.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        header.setTextFill(Color.WHITE);
        gridPane.add(header, 0, 0, 2, 1);

        //Combo box Label
        Label comboLabel = new Label("Choose a specific reservation to cancel:");
        comboLabel.setTextFill(Color.WHITE);
        gridPane.add(comboLabel, 0, 2);

        //Reservation Block
        ComboBox<Reservation> reservationsCombo = new ComboBox<>();
        ArrayList<Reservation> reservationsList = new ArrayList<>();
        reservationsList.add(reservations);

        ObservableList<Reservation> items = FXCollections.observableArrayList(reservationsList);
        reservationsCombo.getItems().addAll(items);
        ListView<Reservation> reservationsListView = new ListView<>(items);
        reservationsListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        gridPane.add(reservationsCombo, 0, 3);

        //Search Reservation
        Label searchBar = new Label("Or enter reservation number: ");
        searchBar.setTextFill(Color.WHITE);
        gridPane.add(searchBar, 0, 4);

        TextField resNum = new TextField();
        resNum.setPrefHeight(30);
        gridPane.add(resNum, 0, 5);

        // Cancel Button
        Button submitButton = new Button("CANCEL");
        submitButton.setTextFill(Color.WHITE);
        submitButton.setPrefWidth(100);
        submitButton.setPrefHeight(40);
        submitButton.setBackground(new Background(new BackgroundFill((Color.rgb(255, 81, 81)), CornerRadii.EMPTY, Insets.EMPTY)));
        gridPane.add(submitButton, 1, 6);
        GridPane.setHalignment(submitButton, HPos.RIGHT);

        // Add Return Button
        Button returnButton = new Button("Return");
        returnButton.setPrefHeight(40);
        returnButton.setDefaultButton(true);
        returnButton.setPrefWidth(100);
        gridPane.add(returnButton, 0, 6);
        GridPane.setHalignment(returnButton, HPos.CENTER);

        returnButton.setOnAction(e ->{
            primaryStage.getScene().setRoot(new ManagerPage(primaryStage));

        });
        //Scene scene = new Scene(gridPane, 500, 800);
        //primaryStage.setScene(scene);
        //primaryStage.show();
        //primaryStage.setTitle("Cancel Reservation");

        setCenter(gridPane);
    }

    private GridPane registrationLayout() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40, 40, 40, 40));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        ColumnConstraints columnOneConstraints = new ColumnConstraints(200, 200, Double.MAX_VALUE);
        columnOneConstraints.setHgrow(Priority.ALWAYS);
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        columnTwoConstrains.setHalignment(HPos.LEFT);
        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);
        gridPane.setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));
        return gridPane;
    }

}


