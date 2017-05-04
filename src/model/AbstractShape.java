package model;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;
import java.util.Collections;

public abstract class AbstractShape extends ShapeObservableAbstract {


	private static final long serialVersionUID = 5896964664095875001L;

	protected Point position;
	protected Point rotateCenter;
	protected Color color;
	protected double rotation; // en degrés

	protected AbstractShape (Point position){
		this.position = position;
		this.rotation = 0;
		this.color = null;
	}

	protected AbstractShape(AbstractShape s){
		this(s.position, s.color);
	}

	protected AbstractShape (Point position, Color color){
		this.position = position;
		this.color = color;
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

	public void translate(int x, int y){
		this.position.translate(x, y);
		this.rotateCenter.translate(x, y);

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

	public Iterator<IShape> iterator () {
		return Collections.emptyIterator();
}
}
