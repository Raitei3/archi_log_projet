package controler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controler {

		
		@FXML
		private Button save;
		

		
		
		public Controler(){}
		
		@FXML
		private void initialize(){
			
			System.out.println("tamere");
			
			save.setOnAction((event)-> {
				System.out.println("button save");
				});
			
		}
}
