package view;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import model.Rect;
import model.RegularPolygon;
import model.Shape;

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
	
	public void Draw(Shape s, Pane p) {
		if (s instanceof Rect) {
			Rectangle rx = new Rectangle(s.getPosition().getX(), s.getPosition().getY(), ((Rect) s).getWidth(),
					((Rect) s).getHeight());
			
			 rx.setFill(Color.BLUE); // PENSER A TRADUIRE LES COULEUR
			p.getChildren().add(rx);
		}
		
		else if (s instanceof RegularPolygon){
			Polygon rx = new Polygon();
		}

	}

}
