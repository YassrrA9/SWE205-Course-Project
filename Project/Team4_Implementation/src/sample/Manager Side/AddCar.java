package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sample.Car;
import sample.ManagerPage;


public class AddCar extends BorderPane {

	private ArrayList<Car> addcar = new ArrayList<>();
	private FileOutputStream outputtype;
	private FileOutputStream outputname;
	private FileOutputStream outputmodel;
	private FileOutputStream outputsize;
	private FileOutputStream outputcolor;

	public AddCar(){}
	public AddCar(Stage primaryStage) throws FileNotFoundException {



//_____________________ArrayList for type of cars_________________
		TextField typeField = new TextField();
		//	ArrayList<String> type = new ArrayList<>();

//______________Action to show each type of the cars______________
		//	typeField.setOnAction(e -> {
		//	type.add(typeField.getText());

		//});

//_________________________Arraylist for the name of cars______________
		TextField nameField = new TextField();
		//	ArrayList<String> name = new ArrayList<>();

//______________Action to send names of the cars to database______________
		//	nameField.setOnAction(e -> {
		//	name.add(nameField.getText());

		//});
//_________________________Arraylist for car model	_____________________
		TextField modelField = new TextField();
		//	ArrayList<String> model = new ArrayList<>();

//______________Action to send models of the cars to database______________
		//	modelField.setOnAction(e -> {
		//	model.add(modelField.getText());

		//	});
//_________________________Arraylist for car size_____________________
		TextField sizeField = new TextField();
		//	ArrayList<String> size = new ArrayList<>();

//______________Action to send size of the cars to database______________
		//	sizeField.setOnAction(e -> {
		//	size.add(sizeField.getText());

		//	});

//_________________________Arraylist for car color
		TextField colorField = new TextField();
		//	ArrayList<String> color = new ArrayList<>();

//______________Action to send colors of the cars to database______________
		//	colorField.setOnAction(e -> {
		//	color.add(colorField.getText());

		//	});

//________________________GridPane to have all the nodes in x-y axis________________
		GridPane pane = new GridPane();
		pane.setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));

//_________________________Label for adding the car_____________________
		Label head = new Label("Add Cars");
		pane.add(head, 1, 0, 2, 1);
		head.setTextFill(Color.WHITE);
		head.setFont(Font.font("Arial", FontWeight.BOLD, 24));

//_________________________Label for car Type_______________________
		typeField.setMaxWidth(100);
		Label l1 = new Label("Car Type:");
		l1.setTextFill(Color.WHITE);
		pane.setAlignment(Pos.CENTER);
		pane.add(l1, 1, 1);
		pane.add(typeField, 2, 1);
		pane.setHgap(10);
		pane.setVgap(10);
		FileOutputStream facultyInfo = new FileOutputStream("FacultyInformation.txt",true);

//_________________________Label for car name_____________________
		nameField.setMaxWidth(100);
		Label l2 = new Label("Car Name");
		l2.setTextFill(Color.WHITE);
		pane.add(l2, 1, 2);
		pane.add(nameField, 2, 2);

//_________________________Label for car model_____________________
		modelField.setMaxWidth(100);
		Label l3 = new Label("Car Model:");
		l3.setTextFill(Color.WHITE);
		pane.add(l3, 1, 3);
		pane.add(modelField, 2, 3);

//_________________________Label for car size_____________________
		sizeField.setMaxWidth(100);
		Label l4 = new Label("Car Size:");
		l4.setTextFill(Color.WHITE);
		pane.add(l4, 1, 4);
		pane.add(sizeField, 2, 4);

//_________________________Label for car color_____________________
		colorField.setMaxWidth(100);
		Label l5 = new Label("Car Color:");
		l5.setTextFill(Color.WHITE);
		pane.add(l5, 1, 5);
		pane.add(colorField, 2, 5);
		//Rent Button

//_________________________Button for to add and the car in the database_____________________

		Button b1 = new Button("Add and Save");
		b1.setMinWidth(60);
		b1.setMinHeight(10);
		Button homeButton = new Button("Home");
		b1.setMinWidth(60);
		b1.setMinHeight(10);
		b1.setStyle("-fx-font: 13 arial; -fx-base: white");

//________________________Action to add the send the data into the database___________________

		b1.setOnAction(e -> {

			try {

				outputname = new FileOutputStream("name.txt", true);
				outputtype = new FileOutputStream("type.txt", true);
				outputmodel = new FileOutputStream("model.txt", true);
				outputsize = new FileOutputStream("size.txt", true);
				outputcolor = new FileOutputStream("color.txt", true);

				PrintWriter pw1 = new PrintWriter(outputtype);
				PrintWriter pw2 = new PrintWriter(outputname);
				PrintWriter pw3 = new PrintWriter(outputmodel);
				PrintWriter pw4 = new PrintWriter(outputsize);
				PrintWriter pw5 = new PrintWriter(outputcolor);

				addcar.add(new Car(typeField.getText(), nameField.getText(), modelField.getText(), sizeField.getText(), colorField.getText()));
				System.out.println(addcar.toString());
				pw1.println(typeField.getText());
				pw1.close();
				outputtype.close();

				pw2.println(nameField.getText());
				pw2.close();
				outputname.close();

				pw3.println(modelField.getText());
				pw3.close();
				outputmodel.close();

				pw4.println(sizeField.getText());
				pw4.close();
				outputsize.close();

				pw5.println(colorField.getText());
				pw5.close();
				outputcolor.close();

			} catch (Throwable e1) {
				e1.printStackTrace();
			}

			Platform.runLater(() -> {
						Alert alert = new Alert(Alert.AlertType.INFORMATION);
						alert.setTitle("Car");
						alert.setHeaderText("The Car has been Added Successful");

						alert.showAndWait();
					}
			);
		});

		pane.add(b1, 2, 6);

//_____________________Button to return the user to the homepage______________


//_____________________Button to return the user to the previous page______________
		Button backButton = new Button("Back");
		backButton.setMinWidth(60);
		backButton.setMinHeight(10);
		backButton.setStyle("-fx-font: 13 arial; -fx-base: white");
		pane.add(backButton, 0, 13, 1, 1);


		setCenter(pane);


		backButton.setOnAction(e ->{
			primaryStage.getScene().setRoot(new ManagerPage(primaryStage));

		});
	}
}



