package JavaFXTest;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class First extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First in JavaFX");

        FlowPane fl = new FlowPane(10,10);
        Scene sc = new Scene(fl,400,400);

        fl.setAlignment(Pos.CENTER);

        Label lab = new Label("Testing text");
        Button b1 = new Button("One");
        Button b2 = new Button("Two");

        b1.setOnAction(event -> lab.setText("One"));
        b2.setOnAction(event -> lab.setText("Two"));


        fl.getChildren().addAll(b1,b2,lab);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
