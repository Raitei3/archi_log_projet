package model;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;


public interface IShape extends Iterable<IShape>, Serializable, Cloneable {


	public Point getPosition();

	public void setPosition(Point position);

	public Point getRotateCenter();
	public void setRotateCenter(Point rotateCenter);

	public void translate(int x, int y);
	public Color getColor();
	public void setColor(Color color);

	public double getRotation();

	public void setRotation(double rotation);
	IShape clone();

}
