package archi_log_projet;

import javafx.scene.Parent;
import javafx.scene.shape.Rectangle;

public class ToolBar extends Parent {
	public ToolBar(){
	Rectangle toolBarBackground = new Rectangle();
	toolBarBackground.setWidth(100);
	toolBarBackground.setHeight(800);
	toolBarBackground.setFill(javafx.scene.paint.Color.BLACK);
	this.getChildren().add(toolBarBackground);
	}
}
		


	