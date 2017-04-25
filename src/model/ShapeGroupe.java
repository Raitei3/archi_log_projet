package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import javafx.scene.layout.Pane;

public class ShapeGroupe extends AbstractShape {
	
	ArrayList<Shape> arrayShape;
	
	public ShapeGroupe(Point pos){
		super(pos);
	}

	public void add(Shape s){
		arrayShape.add(s);
	}
	
	public void remove(Shape s){
		arrayShape.remove(s);
	}
	
	public Shape clone() { // a changer
		
		return arrayShape.get(1);
	}

	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
