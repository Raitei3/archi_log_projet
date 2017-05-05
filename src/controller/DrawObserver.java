package controller;

import model.EventType;
import model.IShape;
import model.SaveGroupShape;

public class DrawObserver implements ShapeDrawer {
	
	SaveGroupShape shapes;
	
	public DrawObserver(){

	}
	
	public void addGroup(SaveGroupShape shape){
		shapes = shape;
	}

	public void update(IShape s) {
		if(s.getEvent() == EventType.CHANGE){
			draw(s);
		}
	}

	public void draw(IShape s){}
	

}
