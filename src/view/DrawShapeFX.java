package view;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import model.Rect;
import model.RegularPolygon;
import model.IShape;

public final class DrawShapeFX {
	
	private static volatile DrawShapeFX instance = null;
	
	private DrawShapeFX(){
		super();
	}
	
	public final static DrawShapeFX getInstance() { // Singleton car un seule
													// d�ssinateur n�c�ssaire.
		if (DrawShapeFX.instance == null) {
			synchronized (DrawShapeFX.class) {
				if (DrawShapeFX.instance == null) {
					DrawShapeFX.instance = new DrawShapeFX();
				}
			}
		}
		return DrawShapeFX.instance;
	}
	
	public Rectangle Draw(IShape s, Pane p) {
		if (s instanceof Rect) {
			Rectangle rx = new Rectangle(s.getPosition().getX(), s.getPosition().getY(), ((Rect) s).getWidth(),
					((Rect) s).getHeight());
			
			 rx.setFill(Color.BLUE); // PENSER A TRADUIRE LES COULEUR
			p.getChildren().add(rx);
			return rx;
		}
		
		else if (s instanceof RegularPolygon){
			Polygon rx = new Polygon();
		}
		return null;

	}

}
