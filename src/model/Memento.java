package model;

import java.awt.Color;
import java.awt.Point;

public class Memento {
	
	private Point pos;
	private Color color;
	
	public Memento(Point p , Color c){
		pos=p;
		color=c;
	}
	
	public Point getStatePos(){
		return pos;
	}
	public Color getStateColor(){
		return color;
	}
	
}
