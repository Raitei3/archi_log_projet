package archi_log_projet;

import java.awt.Color;
import java.awt.Point;

public interface Shape {
	public Point getPosition();
	
	public void setPosition(Point position);
	
	public Point getRotateCenter();
	public void setRotateCenter(Point rotateCenter);
	public double getTranslation();
	
	public void setTranslation(double translation);
	
	public Color getColor();
	public void setColor(Color color);
	
	public double getRotation();
	
	public void setRotation(double rotation);
	Shape clone();
	
}
