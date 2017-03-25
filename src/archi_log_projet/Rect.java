package archi_log_projet;

import java.awt.Color;
import java.awt.Point;

public class Rect extends AbstractShape {

	double width;
	double height;
	public boolean roundedAngle;

	public Rect (double w, double h, Point pos, Point rc, double tr, double r, Color c, boolean ra){
		width = w;
		height = h;
		position = pos;
		rotateCenter = rc;
		translation = tr;
		rotation = r;
		color = c;
		roundedAngle = ra;
	}

	void updateRotateCenter(){
		double x = (position.getX()+width)/2;
		double y = (position.getY()+height)/2;
		rotateCenter.setLocation(x, y);
	}
	
	public Shape clone() {
		Shape s = new Rect (width,height,position,rotateCenter,translation,rotation,color,roundedAngle);
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


}