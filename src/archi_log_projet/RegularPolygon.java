package archi_log_projet;

import java.awt.Point;

import javafx.scene.paint.Color;

public class RegularPolygon extends AbstractShape {
	
	public int nbSide;
	public double lenghtSide;
	public Point position; //on va partir du principe que position est le coin supérieur gauche.
	public Point rotateCenter; // et que rotateCenter est le centre de la figure.
	public Point translation;
	public Color color;
	
	
	public RegularPolygon( int nbS, double ls, Point pos, Point rc, Point tr, Color c){
		nbSide = nbS;
		lenghtSide = ls;
		position = pos;
		rotateCenter = rc;
		translation = tr;
		color = c;
	}
	
	public Shape clone(){
		RegularPolygon r = new RegularPolygon(nbSide, lenghtSide, position, rotateCenter, translation, color);
		return r;
	}


	public int getNbSide() {
		return nbSide;
	}


	public void setNbSide(int nbSide) {
		this.nbSide = nbSide;
	}


	public double getLenghtSide() {
		return lenghtSide;
	}


	public void setLenghtSide(double lenghtSide) {
		this.lenghtSide = lenghtSide;
	}


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

}
