package model;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class RectJavaFX {

	private int thick = 2;
	
	public RectJavaFX(){
	}
	
	public void draw(Rect r,Pane p){
		Rectangle rx = new Rectangle(r.getPosition().getX(),r.getPosition().getY(),r.getWidth(),r.getHeight());
		//rx.setFill(null);
		p.getChildren().add(rx);
	}
	
	
	
	
}
