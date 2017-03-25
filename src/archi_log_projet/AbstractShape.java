package archi_log_projet;

import java.awt.Color;
import java.awt.Point;

public abstract class AbstractShape implements Shape {
	protected Point position;
	protected Point rotateCenter;
	protected double translation;
	protected Color color;
	protected double rotation; // en degrés
	public abstract Shape clone();
	
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
	
	public double getTranslation() {
		return translation;
	}
	
	public void setTranslation(double translation) {
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
	
}
