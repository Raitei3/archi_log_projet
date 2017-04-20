package archi_log_projet;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;

public interface Shape extends Iterable<Shape>, Serializable, Cloneable {
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
