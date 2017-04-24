package model;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;

public class RegularPolygon extends AbstractShape {
	
	public int nbSide;
	public double lenghtSide;
	
	
	public RegularPolygon( int nbS, double ls, Point pos, Point rc, Point tr){
		super(pos);
		nbSide = nbS;
		lenghtSide = ls;
		rotateCenter = rc;
		translation = tr;
	}
	
	public Shape clone(){
		RegularPolygon r = new RegularPolygon(nbSide, lenghtSide, position, rotateCenter, translation);
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

	@Override
	public Iterator<Shape> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
