package view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage stage;
	private BorderPane root;


	@Override
	public void start(Stage primaryStage) {
	this.stage = primaryStage;
	this.stage.setTitle("PicShop");

	initRootLayout();
	showPersonOverview();
	}

	public void initRootLayout(){
		try {
			FXMLLoader fxml = new FXMLLoader();
			fxml.setLocation(MainApp.class.getResource("Window.fxml"));
			root = (BorderPane) fxml.load();

			Scene s = new Scene(root);
			stage.setScene(s);
			stage.show();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void showPersonOverview(){
		try{
			FXMLLoader fxml = new FXMLLoader();
			fxml.setLocation(MainApp.class.getResource("PersonOverview.fxml"));
			AnchorPane personOverview = (AnchorPane) fxml.load();
			root.setCenter(personOverview);
		}catch(IOException e){
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		launch(args);
	}
}
