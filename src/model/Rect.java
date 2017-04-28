package model;

import java.awt.Color;
import java.awt.Point;

public class Rect extends AbstractShape {


	private static final long serialVersionUID = 2159923778034500698L;
	
	double width;
	double height;
	public boolean roundedAngle;

	public Rect (Point pos, double w, double h){
		super(pos);
		this.width = w;
		this.height = h;
		this.updateRotateCenter();
	}

	public Rect (Point pos, double w, double h, Color c){
		super(pos, c);
		this.width = w;
		this.height = h;
		this.updateRotateCenter();
	}


	public void updateRotateCenter(){
		int x = (int)(position.getX()+width/2);
		int y = (int)(position.getY()+height/2);
		this.setRotateCenter(new Point(x,y));
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		updateRotateCenter();
		notify();

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		updateRotateCenter();
		notify();
	}

	public boolean isRoundedAngle() {
		return roundedAngle;
	}

	public void setRoundedAngle(boolean roundedAngle) {
		this.roundedAngle = roundedAngle;
		notify();
	}

	public IShape copy() {
		IShape s = new Rect (position, width, height,color);
		return s;
	}

	public void addShape(IShape s) {
		throw new UnsupportedOperationException();
	}

	public void removeShape(IShape s) {}
	
	public void accept(AddObserverAllShapeGroup v) {
		v.visit(this);
	}

	
}