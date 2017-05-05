package model;

import java.awt.Color;
import java.awt.Point;
import java.io.Serializable;


public interface IShape extends Serializable, Iterable<IShape>{

	/**
	 * Shape methods
	 */
	public Point getPosition();
	public void setPosition(Point position);
	public Point getRotateCenter();
	public void setRotateCenter(Point rotateCenter);
	public void translate(int x, int y);
	public Color getColor();
	public void setColor(Color color);
	public double getRotation();
	public void setRotation(double rotation);
	/**
	 * Visitor method
	 * Pattern qui permettra entre autre de redonner des observer
	 * a toute les shapes dans le cas d'une recharge d'un fichier
	 */
	public void accept(IVisitor v);
	/**
	 * Prototype method
	 * Pattern qui servira a faire les copy des objet lors des drag and drop
	 */
	public IShape copy();
	/**
	 * Composite method
	 * Pattern essentiel a la r�alisation des groupage de shape
	 * et <ui pourra aussi servir a sauvegarder tout un contexte.
	 */
	public void addShape(IShape s);
	public void removeShape(IShape s);
	/**
	 * Observer methods
	 * Lien entre le model et la view.
	 */
	public void addObserver(ShapeObserver o);
	public void RemoveObserver(ShapeObserver o);
	public void notifyObserver();
	public void saveNotify();
	public void drawNotify();
	public EventType getEvent();
	public void setEvent(EventType event);

}
