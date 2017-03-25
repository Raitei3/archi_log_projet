package archi_log_projet;

import java.awt.Color;
import java.awt.Point;

public class RegularPolygon extends AbstractShape {
	
	public int nbSide;
	public double lenghtSide;
	
	
	public RegularPolygon( int nbS, double ls, Point pos, Point rc, double tr, double r, Color c){
		nbSide = nbS;
		lenghtSide = ls;
		position = pos;
		rotateCenter = rc;
		rotation = r;
		translation = tr;
		color = c;
	}
	
	public Shape clone(){
		RegularPolygon r = new RegularPolygon(nbSide, lenghtSide, position, rotateCenter, translation, rotation, color);
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
	
}
