package model;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;


public interface IShape extends Serializable { 

	/**
	 * Shape methods
	 */
	public Point getPosition();
	public void setPosition(Point position);
	public Point getRotateCenter();
	public void setRotateCenter(Point rotateCenter);
	public void translate(int x, int y);
	public Color getColor();
	public void setColor(Color color);
	public double getRotation();
	public void setRotation(double rotation);
	/**
	 * Visitor method
	 */
	public void accept(AddObserverAllShapeGroup v);
	/**
	 * Prototype method
	 */
	public IShape copy();
	/**
	 * Composite method
	 */
	public void addShape(IShape s);
	public void removeShape(IShape s);
	/**
	 * Observer methods
	 */
	public void addObserver(ShapeObserver o);
	public void RemoveObserver(ShapeObserver o);
	public void notifyObserver();
	
}
