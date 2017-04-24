package view;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ToolBar extends Parent {
	public ToolBar(){
		VBox toolBar = new VBox(5);			//Create an Horizontal Box with a spacing of 5
		toolBar.setPadding(new Insets(10)); // Create a padding around the box
		Button p = new Button("test");
		Button p2 = new Button("2eme");
		toolBar.getChildren().add(p);		// We add button for a test. Later Arraylist of shape
		toolBar.getChildren().add(p2);

		this.getChildren().add(toolBar);	// Add the Button to the container
	}

}



