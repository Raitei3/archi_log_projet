package model;

import javafx.scene.shape.Rectangle;

public class RectJavaFX {

	Rect rect;
	Rectangle rectfx;
	int thick = 20;
	
	public RectJavaFX(Rect r){
		rectfx = new Rectangle(r.getPosition().getX(),r.getPosition().getY(),r.getWidth(),r.getHeight());
		rect = r;
	}
	
	
}
