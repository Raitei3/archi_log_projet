package model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

public abstract class AbstractShape implements Shape {
	protected Point position;

	protected Point rotateCenter;
	protected Color color;

	protected Point translation;
	protected double rotation; // en degrés

	protected ArrayList<ShapeObserver> observers;

	public abstract Shape clone();

	protected AbstractShape(Point position){
		this.position = position;
		this.rotation = 0;
		this.color = null;

	}

	protected AbstractShape( Point position, Color color, double rotation){
		this.position = position;
		this.color = color;
		this.rotation = rotation;
	}
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Point getRotateCenter() {
		return rotateCenter;
	}

	public void setRotateCenter(Point rotateCenter) {
		this.rotateCenter = rotateCenter;
	}

	public Point getTranslation() {
		return translation;
	}

	public void setTranslation(Point translation) {
		this.translation = translation;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public void add(ShapeObserver o){
		this.observers.add(o);
	}

	public void remvove(ShapeObserver o){
		this.observers.remove(o);
	}

	public void update(){
		for(ShapeObserver observer : this.observers)
			observer.update(this);
	}
}
