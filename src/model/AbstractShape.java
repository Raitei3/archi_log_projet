package model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public abstract class AbstractShape implements Shape {

	private static final long serialVersionUID = 1L;

	protected Point position;

	protected Point rotateCenter;
	protected Color color;

	/* translation et rotation pas en construisant mais click droit */
	protected Point translation;
	protected double rotation; // en degrés

	protected ArrayList<ShapeObserver> observers;

	public abstract Shape clone();

	protected AbstractShape (Point position){
		this.position = position;
		this.rotation = 0;
		this.color = null;
		this.observers = new ArrayList<ShapeObserver>();
	}

	protected AbstractShape (Point position, Color color){
		this.position = position;
		this.color = color;
		this.observers = new ArrayList<ShapeObserver>();
	}
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
		this.updateObservers();
	}

	public Point getRotateCenter() {
		return rotateCenter;
	}

	public void setRotateCenter(Point rotateCenter) {
		this.rotateCenter = rotateCenter;
		this.updateObservers();
	}

	public Point getTranslation() {
		return translation;
	}

	public void setTranslation(Point translation) {
		this.translation = translation;
		this.updateObservers();
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		this.updateObservers();
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
		this.updateObservers();
	}

	public void add(ShapeObserver o){
		this.observers.add(o);
	}

	public void remvove(ShapeObserver o){
		this.observers.remove(o);
	}

	public void updateObservers(){
		for(ShapeObserver observer : this.observers)
			observer.update(this);
	}
}
