package model;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;

import javafx.scene.layout.Pane;

public interface Shape extends Iterable<Shape>, Serializable, Cloneable {
	
	
	public void drawFX(Pane p);
	public Point getPosition();
	
	public void setPosition(Point position);
	
	public Point getRotateCenter();
	public void setRotateCenter(Point rotateCenter);
	public Point getTranslation();
	
	public void setTranslation(Point translation);
	
	public Color getColor();
	public void setColor(Color color);
	
	public double getRotation();
	
	public void setRotation(double rotation);
	Shape clone();
	
}
