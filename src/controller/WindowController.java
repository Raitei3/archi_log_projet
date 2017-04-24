package controller;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class WindowController implements Initializable {

		
		@FXML
		private Button save;
		
		@FXML
		private Button load;
		
		@FXML
		private Button undo;
		
		@FXML
		private Button redo;
		
		@FXML
		private Button trash;

		
		
		public WindowController(){}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			System.out.println("test");
			
			save.setOnAction((event)-> {
				System.out.println("button save");
				});
			
			load.setOnAction((event)-> {
				System.out.println("button load");
				});
			
			undo.setOnAction((event)-> {
				System.out.println("button undo");
				});
			
			redo.setOnAction((event)-> {
				System.out.println("button redo");
				});
			
			trash.setOnAction((event)-> {
				System.out.println("button trash");
				});

		}
}
