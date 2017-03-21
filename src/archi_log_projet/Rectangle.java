package archi_log_projet;

import java.awt.Point;

import javafx.scene.paint.Color;

public class Rectangle extends RegularPolygon {

	double width;
	double height;
	public Point position; //on va partir du principe que position est le coin supérieur gauche.
	public Point rotateCenter; // et que rotateCenter est le centre de la figure.
	public Point translation;
	public Color color;
	public boolean roundedAngle;

	public Rectangle(double w, double h, Point pos, Point rc, Point tr, Color c, boolean ra){
		width = w;
		height = h;
		position = pos;
		rotateCenter = rc;
		translation = tr;
		color = c;
		roundedAngle = ra;
	}

	void updateRotateCenter(){
		double x = position.getX()+width/2;
		double y = position.getY()+height/2;
		rotateCenter.setLocation(x, y);
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

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
		updateRotateCenter();
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

	public boolean isRoundedAngle() {
		return roundedAngle;
	}

	public void setRoundedAngle(boolean roundedAngle) {
		this.roundedAngle = roundedAngle;
	}




}
