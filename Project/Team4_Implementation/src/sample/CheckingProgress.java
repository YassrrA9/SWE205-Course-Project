package sample;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CheckingProgress extends BorderPane {

    public CheckingProgress(CarRemoval Obj){
        Text t = new Text("Do you want to complete the process?");
        Button b1 = new Button("Yes");

        Button b2 = new Button("No");
        FlowPane n = new FlowPane(b1,b2);
        n.setHgap(15);
        n.setAlignment(Pos.CENTER);
        b1.setMaxWidth(50);
        b2.setMaxWidth(50);
        n.setPadding(new Insets(20,20,20,20));


        FlowPane pn = new FlowPane(Orientation.VERTICAL);
        pn.getChildren().addAll(t);
        pn.setAlignment(Pos.CENTER);
        pn.setVgap(14);
        BorderPane pane = new BorderPane();
        pane.setCenter(pn);
        pane.setBottom(n);

        Scene SCENE1 = new Scene(pane,350,150);
        Stage s = new Stage();
        s.setScene(SCENE1);
        s.show();

        b1.setOnMouseClicked(e ->{
            //Chenged will happen here
            s.close();

        });

        b2.setOnMouseClicked(e ->{
            s.close();
        });
    }
    public CheckingProgress(PreOrder Obj){

        Text GeneralText = new Text("Do you want to complete the process?");
        Button YesButton = new Button("Yes");
        Button NoButton = new Button("No");
        YesButton.setMaxWidth(50);
        NoButton.setMaxWidth(50);

        FlowPane n = new FlowPane(YesButton, NoButton);
        n.setHgap(15);
        n.setAlignment(Pos.CENTER);
        n.setPadding(new Insets(20,20,20,20));


        FlowPane pn = new FlowPane(Orientation.VERTICAL);
        pn.getChildren().addAll(GeneralText);
        pn.setAlignment(Pos.CENTER);
        pn.setVgap(14);
        BorderPane pane = new BorderPane();
        pane.setCenter(pn);
        pane.setBottom(n);

        Scene SCENE1 = new Scene(pane,350,150);
        Stage s = new Stage();
        s.setScene(SCENE1);
        s.show();

        YesButton.setOnMouseClicked(e ->{
            //Chenged will happen here
            s.close();

        });

        NoButton.setOnMouseClicked(e ->{
            s.close();
        });
    }

    public CheckingProgress(RentCar Obj){
        Text GeneralText = new Text("Do you want to complete the process?");
        Button YesButton = new Button("Yes");
        Button NoButton = new Button("No");
        YesButton.setMaxWidth(50);
        NoButton.setMaxWidth(50);

        FlowPane n = new FlowPane(YesButton, NoButton);
        n.setHgap(15);
        n.setAlignment(Pos.CENTER);
        n.setPadding(new Insets(20,20,20,20));


        FlowPane pn = new FlowPane(Orientation.VERTICAL);
        pn.getChildren().addAll(GeneralText);
        pn.setAlignment(Pos.CENTER);
        pn.setVgap(14);
        BorderPane pane = new BorderPane();
        pane.setCenter(pn);
        pane.setBottom(n);

        Scene SCENE1 = new Scene(pane,350,150);
        Stage s = new Stage();
        s.setScene(SCENE1);
        s.show();

        YesButton.setOnMouseClicked(e ->{
            //Chenged will happen here
            s.close();

        });

        NoButton.setOnMouseClicked(e ->{
            s.close();
        });
    }

    public CheckingProgress(CancelReservationC Obj){
        Text GeneralText = new Text("Do you want to complete the process?");
        Button YesButton = new Button("Yes");
        Button NoButton = new Button("No");
        YesButton.setMaxWidth(50);
        NoButton.setMaxWidth(50);

        FlowPane n = new FlowPane(YesButton, NoButton);
        n.setHgap(15);
        n.setAlignment(Pos.CENTER);
        n.setPadding(new Insets(20,20,20,20));


        FlowPane pn = new FlowPane(Orientation.VERTICAL);
        pn.getChildren().addAll(GeneralText);
        pn.setAlignment(Pos.CENTER);
        pn.setVgap(14);
        BorderPane pane = new BorderPane();
        pane.setCenter(pn);
        pane.setBottom(n);

        Scene SCENE1 = new Scene(pane,350,150);
        Stage s = new Stage();
        s.setScene(SCENE1);
        s.show();

        YesButton.setOnMouseClicked(e ->{
            //Chenged will happen here
            s.close();

        });

        NoButton.setOnMouseClicked(e ->{
            s.close();
        });
    }
    public CheckingProgress(ReportProblem Obj){
        Text GeneralText = new Text("The problem has been reported");
        Button YesButton = new Button("Ok");
        //Button NoButton = new Button("No");
        YesButton.setMaxWidth(50);
        //NoButton.setMaxWidth(50);

        FlowPane n = new FlowPane(YesButton);
        n.setHgap(15);
        n.setAlignment(Pos.CENTER);
        n.setPadding(new Insets(20,20,20,20));


        FlowPane pn = new FlowPane(Orientation.VERTICAL);
        pn.getChildren().addAll(GeneralText);
        pn.setAlignment(Pos.CENTER);
        pn.setVgap(14);
        BorderPane pane = new BorderPane();
        pane.setCenter(pn);
        pane.setBottom(n);

        Scene SCENE1 = new Scene(pane,350,150);
        Stage s = new Stage();
        s.setScene(SCENE1);
        s.show();

        YesButton.setOnMouseClicked(e ->{
            //Chenged will happen here
            s.close();

        });


    }
    }




