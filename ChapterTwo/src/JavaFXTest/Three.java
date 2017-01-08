package JavaFXTest;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Three extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Three");
        BorderPane bdPane = new BorderPane();
        Scene sc = new Scene(bdPane,300,300);
        primaryStage.setScene(sc);

        /*Primary Menu*/
        Label label1 = new Label("Choose menu");
        MenuBar pr_menu = new MenuBar();
        Menu file = new Menu("_File");
        Menu edit = new Menu("_Edit");
        Menu help = new Menu("_Help");
        MenuItem new_item = new MenuItem("_New");
        MenuItem open_item = new MenuItem("_Open");
        MenuItem close_item = new MenuItem("_Close");
        MenuItem exit = new MenuItem("_Exit");
        MenuItem copy = new MenuItem("_Copy");
        MenuItem paste = new MenuItem("_Paste");
        MenuItem about = new MenuItem("_About");
        SeparatorMenuItem sep1 = new SeparatorMenuItem();
        ContextMenu con = new ContextMenu(copy,paste);
        file.getItems().addAll(new_item,open_item,close_item,sep1,exit);
        edit.getItems().addAll(copy,paste);
        help.getItems().add(about);
        pr_menu.getMenus().addAll(file,edit,help);
        EventHandler<ActionEvent> event = event1 -> {
            String name = ((MenuItem)event1.getTarget()).getText();
            if (name.equals("Exit")) Platform.exit();
            label1.setText(name);
        };
        exit.setAccelerator(KeyCombination.keyCombination("shortcut+Q"));
        new_item.setOnAction(event);
        open_item.setOnAction(event);
        close_item.setOnAction(event);
        exit.setOnAction(event);
        copy.setOnAction(event);
        paste.setOnAction(event);
        about.setOnAction(event);

        bdPane.setOnContextMenuRequested(event1 -> con.show(bdPane,event1.getScreenX(),event1.getScreenY()));
        bdPane.setTop(pr_menu);
        bdPane.setCenter(label1);
        primaryStage.show();
    }
}
