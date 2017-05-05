package test;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	//private Stage stage;
	//private BorderPane root;


	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Projet AL");
	
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../view/PersonOverview.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	public static void main(String[] args) {
		launch(args);
	}
}
