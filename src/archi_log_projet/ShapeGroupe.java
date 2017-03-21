package archi_log_projet;

import java.util.ArrayList;

public class ShapeGroupe extends AbstractShape {
	
	ArrayList<Shape> arrayShape;
	
	public ShapeGroupe(){
		
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
}
