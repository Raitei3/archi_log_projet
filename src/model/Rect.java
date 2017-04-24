package model;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;

public class Rect extends AbstractShape {

	double width;
	double height;
	public boolean roundedAngle;

	public Rect (Point pos, double w, double h){
		super(pos);
		this.width = w;
		this.height = h;
		this.updateRotateCenter();
	}
	
	public Rect (Point pos, double w, double h, Color c, double r){
		super(pos, c, r);
		this.width = w;
		this.height = h;
		this.updateRotateCenter();
	}

	
	void updateRotateCenter(){
		double x = (position.getX()+width)/2;
		double y = (position.getY()+height)/2;
		rotateCenter.setLocation(x, y);
	}
	
	public Shape clone() {
		Shape s = new Rect (position, width, height,color, rotation);
		return s;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		updateRotateCenter();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		updateRotateCenter();
	}

	public boolean isRoundedAngle() {
		return roundedAngle;
	}

	public void setRoundedAngle(boolean roundedAngle) {
		this.roundedAngle = roundedAngle;
	}

	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


}