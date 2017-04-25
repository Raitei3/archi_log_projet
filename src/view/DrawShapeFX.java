package view;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import model.Rect;
import model.RegularPolygon;

public final class DrawShapeFX {
	
	private static volatile DrawShapeFX instance = null;
	
	private DrawShapeFX(){
		super();
	}
	
	public final static DrawShapeFX getInstance() { // Singleton car un seule
													// déssinateur nécéssaire.
		if (DrawShapeFX.instance == null) {
			synchronized (DrawShapeFX.class) {
				if (DrawShapeFX.instance == null) {
					DrawShapeFX.instance = new DrawShapeFX();
				}
			}
		}
		return DrawShapeFX.instance;
	}
	
	public void Draw(Rect r, Pane p){
		Rectangle rx = new Rectangle(r.getPosition().getX(),r.getPosition().getY(),r.getWidth(),r.getHeight());
		//rx.setFill(null);
		p.getChildren().add(rx);
	}
	
	public void Draw(RegularPolygon r, Pane p){// on surcharge draw un peu comme avec un visiteur. Simple et efficase.
	}
		

}
