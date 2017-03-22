package archi_log_projet;

import java.awt.Color;
import java.awt.Point;

public class RegularPolygon extends AbstractShape {
	int nb_side;
	double side_size;
	public Point position;
	public Color color;
	public Point rotateCenter;
	public Point translation;
	int rotation;
	
	public RegularPolygon(int ns, double sz, Point pos, Color c, Point rc, Point t, int r){
		nb_side = ns;
		side_size = sz;
		position = pos;
		color = c;
		rotateCenter = rc;
		translation = t;
		rotation = r;
	}

	public int getNb_side() {
		return nb_side;
	}

	public void setNb_side(int nb_side) {
		this.nb_side = nb_side;
	}

	public double getSide_size() {
		return side_size;
	}

	public void setSide_size(double side_size) {
		this.side_size = side_size;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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

	public int getRotation() {
		return rotation;
	}

	public void setRotation(int rotation) {
		this.rotation = rotation;
	}
}
