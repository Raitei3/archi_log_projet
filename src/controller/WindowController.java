package controller;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.awt.Point;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import model.Rect;
import model.RectJavaFX;
import model.Shape;

public class WindowController implements Initializable {

		RectJavaFX rectfx;
		
		
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

		@FXML
		private AnchorPane dashboard;
		
		private ArrayList<Shape> dashboardShape;
		
		
		public WindowController(){}

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			System.out.println("test");
			
			dashboardShape = new ArrayList<Shape>();
			rectfx = new RectJavaFX();
			initDashboard();
			
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

			draw();
		}
		
		public void initDashboard(){
			
			Rect r = new Rect(new Point(20,20),50,30);
			dashboardShape.add(r);
			
		}
		
		public void draw(){
			for (Shape s : dashboardShape){
				s.drawFX(dashboard);
			}
		}
}
