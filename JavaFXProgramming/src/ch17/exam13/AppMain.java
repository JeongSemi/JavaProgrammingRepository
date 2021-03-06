package ch17.exam13;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AppMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("root.fxml")); //AppMain.class.getResource() 똑같음
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Controller");
        
        primaryStage.setOnCloseRequest(event -> {
            System.out.println("Close");
        });
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
