package JavaFXTest;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Two extends Application{
    private CheckBox c1,c2,c3;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        /*Main*/
        FlowPane flp = new FlowPane(10,10);
        Scene scene = new Scene(flp,300,300);
        primaryStage.setScene(scene);
        flp.setAlignment(Pos.CENTER);
        primaryStage.setTitle("Two");

        /*Separators*/
        Separator sep = new Separator();
        Separator sep2 = new Separator();
        Separator sep3 = new Separator();
        Separator sep4 = new Separator();
        sep4.setPrefWidth(300);
        sep3.setPrefWidth(300);
        sep2.setPrefWidth(300);
        sep.setPrefWidth(300);

        /*Test ToggleButton*/
        Label lab1 = new Label();
        ToggleButton b1 = new ToggleButton("Test Toggle");
        b1.fire();
        b1.setOnAction(event -> {if (b1.isSelected()) lab1.setText("Button 1 is pressed"); else lab1.setText("Button 1 is unpressed");});

        /*Test RadioButton with ChangeListener*/
        Label lab2 = new Label();
        RadioButton r1 = new RadioButton("Radio one");
        RadioButton r2 = new RadioButton("Radio two");
        RadioButton r3 = new RadioButton("Radio three");
        ToggleGroup gr = new ToggleGroup();
        r1.setToggleGroup(gr);
        r2.setToggleGroup(gr);
        r3.setToggleGroup(gr);
        gr.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            RadioButton rb = (RadioButton)newValue;
            lab2.setText(rb.getText());
        });

        /*Test CheckBox*/
        Label lab3 = new Label();
        c1 = new CheckBox("Box one");
        c2 = new CheckBox("Box two");
        c3 = new CheckBox("Box three");
        c1.setOnAction(event -> showAll(lab3));
        c2.setOnAction(event -> showAll(lab3));
        c3.setOnAction(event -> showAll(lab3));

        /*Test ListView<T>*/
        Label lab4 = new Label();
        ObservableList<String> obs =FXCollections.observableArrayList("Train","Car","Airplane");
        ListView<String> lv = new ListView<>(obs);
        lv.setPrefSize(80,80);
        MultipleSelectionModel<String> selMod = lv.getSelectionModel();
        //lv.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);//if need multiple
        selMod.selectedItemProperty().addListener((observable, oldValue, newValue) -> lab4.setText(newValue));

        /*Test ComboBox*/
        ObservableList<String> obs2 = FXCollections.observableArrayList("One","Two","Three");
        ComboBox<String> cBox = new ComboBox<>(obs2);
        cBox.setValue("One");

        /*Effects*/
        Effect gl = new Glow(0.5);
        b1.setEffect(gl);
        Effect sh = new Shadow();
        b1.setEffect(sh);

        /*Main*/
        flp.getChildren().addAll(b1,lab1,sep,r1,r2,r3,lab2,sep2,c1,c2,c3,lab3,sep3,lv,lab4,sep4,cBox);
        primaryStage.show();
    }
    private void showAll(Label lab3){
        String str = "";
        if (c1.isSelected())str = "  Box 1 ";
        if (c2.isSelected())str += "Box 2 ";
        if (c3.isSelected())str += "Box 3";
        lab3.setText(str);
    }
}
