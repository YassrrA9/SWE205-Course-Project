package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CancelReservationC extends BorderPane {

	private Reservation reservation = new Reservation();

	public CancelReservationC() {
	}

	public CancelReservationC(Stage primaryStage) {


//_________________________Pane to handle all the nodes int the scene_______________________

		//GridPane pane = new GridPane();
		//pane.setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));


//_________________________Label named cancel reservation__________________________
		Text SubjectText = new Text("Cancel Reservation");
		SubjectText.setFill(Color.WHITE);
		SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		SubjectText.setX(100);

//_________________________TextField to allow the user to enter the number of the reservation_________________	
		TextField txField = new TextField();
		Label l1 = new Label("Reservation Number");
		l1.setTextFill(Color.WHITE);
		l1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));

		//pane.setAlignment(Pos.CENTER);
		//pane.add(txField, 1, 1);
		//pane.add(l1, 0, 1);
		//l1.setFont(Font.font("Arial", FontWeight.BOLD, 13));

		//pane.setHgap(10);
		//pane.setVgap(10);

//_________________________Button named Cancel reservation to give an action once the user pressed on it_______________
		Button SubmitButton = new Button("Submit");
		Button ReturnButton = new Button("Return");
		SubmitButton.setMaxWidth(120);
		ReturnButton.setMaxWidth(120);
		SubmitButton.setPrefSize(90,30);
		ReturnButton.setPrefSize(90,30);
		SubmitButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
		ReturnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 13));

		SubmitButton.setOnAction(e -> {
			reservation.deleteReservation(txField.getText());

//________________________Check if the user has entered the input or not or entered incorrectly___________________
			if (txField.getText().isEmpty()) {
				Platform.runLater(() -> {
							Alert alert = new Alert(Alert.AlertType.ERROR);
							alert.setTitle("Cancel Reservation");
							alert.setHeaderText("Please Try Again and Enter Correct Number");

							alert.showAndWait();
						}
				);

			} else {
				Platform.runLater(() -> {
							CancelReservationC Obj = new CancelReservationC();
							CheckingProgress check = new CheckingProgress(Obj);
						}
				);
			}
		});

		ReturnButton.setOnAction( e ->{
			primaryStage.getScene().setRoot(new CustomerPage(primaryStage));

		});

		//pane.add(b1, 1, 3);

//_____________________Button to return the user to the homepage______________


//_____________________Button to return the user to the previous page______________
		HBox Box1 = new HBox();
		Box1.getChildren().addAll(l1,txField);
		Box1.setAlignment(Pos.CENTER);
		Box1.setSpacing(10);

		HBox SubjectBox = new HBox();
		SubjectBox.getChildren().add(SubjectText);
		SubjectBox.setSpacing(10);
		SubjectBox.setAlignment(Pos.CENTER);

		HBox ButtonsBox = new HBox();
		ButtonsBox.getChildren().addAll(ReturnButton,SubmitButton);
		ButtonsBox.setAlignment(Pos.CENTER);
		ButtonsBox.setSpacing(10);

		FlowPane Pane = new FlowPane(Orientation.VERTICAL);
		Pane.getChildren().addAll(SubjectBox,Box1,ButtonsBox);
		Pane.setAlignment(Pos.CENTER);
		Pane.setVgap(50);

		setCenter(Pane);
		setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));





	}

}




