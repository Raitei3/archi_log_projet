package test;

import java.io.IOException;

import controller.WindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
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
		WindowController controller = (WindowController) loader.getController();
		Scene scene = new Scene(page);
		primaryStage.setScene(scene);
		primaryStage.show();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
	
	//initRootLayout();
	//showPersonOverview();

	/*public void initRootLayout(){
		try {
			FXMLLoader fxml = new FXMLLoader();
			fxml.setLocation(MainApp.class.getResource("Window.fxml"));
			root = (BorderPane) fxml.load();

			Scene s = new Scene(root);
			//stage.setScene(s);
			//stage.show();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public void showPersonOverview(){
		try{
			FXMLLoader fxml2 = new FXMLLoader();
			fxml2.setLocation(MainApp.class.getResource("PersonOverview.fxml"));
			AnchorPane personOverview = (AnchorPane) fxml2.load();
			root.setCenter(personOverview);
		}catch(IOException e){
			e.printStackTrace();
		}
	}*/



	public static void main(String[] args) {
		launch(args);
	}
}
