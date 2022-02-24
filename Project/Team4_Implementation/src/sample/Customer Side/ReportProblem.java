package sample;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ReportProblem extends BorderPane {

    public ReportProblem(){}
    public ReportProblem(Stage primaryStage){

        Button CarAccidentButton = new Button("Car Accident");
        Button CarIssueButton = new Button("Car Issue");
        Button ReservationTimeButton = new Button("Reservation Time");
        Button TransactionIssueButton = new Button("Transaction Issue");
        Button AccountIssueButton = new Button("Account Issue");
        Button PreOrderIssueButton = new Button("Pre-Order Issue");
        Button ContactButton = new Button("Contact");
        Button ReturnButton = new Button("Return");


        CarAccidentButton.setMaxWidth(140);
        CarIssueButton.setMaxWidth(140);
        ReservationTimeButton.setMaxWidth(140);
        TransactionIssueButton.setMaxWidth(140);
        AccountIssueButton.setMaxWidth(140);
        PreOrderIssueButton.setMaxWidth(140);
        ContactButton.setMaxWidth(140);
        ReturnButton.setMaxWidth(140);


        CarAccidentButton.setPrefSize(130,30);
        CarIssueButton.setPrefSize(130,30);
        ReservationTimeButton.setPrefSize(130,30);
        TransactionIssueButton.setPrefSize(130,30);
        AccountIssueButton.setPrefSize(130,30);
        PreOrderIssueButton.setPrefSize(130,30);
        ContactButton.setPrefSize(80,30);
        ReturnButton.setPrefSize(80,30);

        CarAccidentButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        CarIssueButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        ReservationTimeButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        TransactionIssueButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        AccountIssueButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        PreOrderIssueButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        ContactButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));
        ReturnButton.setFont(Font.font("Verdana", FontWeight.BOLD, 11));




        Text SubjectText = new Text("Report a problem ");
        Text TextSub1 = new Text("Or Contact Support Team");
        SubjectText.setFill(Color.WHITE);
        TextSub1.setFill(Color.WHITE);
        SubjectText.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        TextSub1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 12));


        VBox SubjectBox = new VBox();
        SubjectBox.setAlignment(Pos.CENTER);
        SubjectBox.getChildren().add(SubjectText);

        VBox ButtonsBox1 = new VBox();
        ButtonsBox1.setAlignment(Pos.CENTER_LEFT);
        ButtonsBox1.getChildren().addAll(CarAccidentButton,CarIssueButton, ReservationTimeButton);
        ButtonsBox1.setSpacing(15);

        VBox ButtonsBox2 = new VBox();
        ButtonsBox2.setAlignment(Pos.CENTER_RIGHT);
        ButtonsBox2.getChildren().addAll(TransactionIssueButton, AccountIssueButton, PreOrderIssueButton);
        ButtonsBox2.setSpacing(15);

        HBox ButtonsBox3 = new HBox();
        ButtonsBox3.getChildren().addAll(ReturnButton, ContactButton);
        ButtonsBox3.setAlignment(Pos.CENTER);
        ButtonsBox3.setSpacing(10);

        VBox Box3 = new VBox();
        Box3.setAlignment(Pos.CENTER);
        Box3.getChildren().addAll(TextSub1, ButtonsBox3);
        Box3.setSpacing(10);

        FlowPane smallpane = new FlowPane(Orientation.HORIZONTAL);
        smallpane.getChildren().addAll(ButtonsBox1,ButtonsBox2);
        smallpane.setAlignment(Pos.CENTER);
        smallpane.setHgap(15);

        FlowPane Pane = new FlowPane(Orientation.VERTICAL);
        Pane.setAlignment(Pos.CENTER);
        Pane.getChildren().addAll(SubjectBox, smallpane,Box3);
        Pane.setVgap(50);

        setCenter(Pane);
        setBackground(new Background(new BackgroundFill((Color.DARKSLATEGRAY), CornerRadii.EMPTY, Insets.EMPTY)));

        CarAccidentButton.setOnMouseClicked(e ->{
            //To be Designed
            ReportProblem Obj = new ReportProblem();
            CheckingProgress check = new CheckingProgress(Obj);
        });
        CarIssueButton.setOnMouseClicked(e ->{
            //To be Designed
            ReportProblem Obj = new ReportProblem();
            CheckingProgress check = new CheckingProgress(Obj);
        });
        ReservationTimeButton.setOnMouseClicked(e ->{
            //To be Designed
            ReportProblem Obj = new ReportProblem();
            CheckingProgress check = new CheckingProgress(Obj);
        });
        TransactionIssueButton.setOnMouseClicked(e ->{
            //To be Designed
            ReportProblem Obj = new ReportProblem();
            CheckingProgress check = new CheckingProgress(Obj);
        });
        AccountIssueButton.setOnMouseClicked(e ->{
            //To be Designed
            ReportProblem Obj = new ReportProblem();
            CheckingProgress check = new CheckingProgress(Obj);
        });
        PreOrderIssueButton.setOnMouseClicked(e ->{
            //To be Designed
            ReportProblem Obj = new ReportProblem();
            CheckingProgress check = new CheckingProgress(Obj);
        });
        ContactButton.setOnMouseClicked(e ->{
            //To be Designed
        });
        ReturnButton.setOnMouseClicked(e ->{
            //To be Designed
                primaryStage.getScene().setRoot(new CustomerPage(primaryStage));


        });

    }
}
