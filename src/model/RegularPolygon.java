package model;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;

public class RegularPolygon extends AbstractShape {

	private static final long serialVersionUID = 1L;

	public int nbSide;
	public double lenghtSide;


	public RegularPolygon( int nbS, double ls, Point pos){
		super(pos);
		this.color = Color.BLACK;
		this.nbSide = nbS;
		this.lenghtSide = ls;
		this.updateRotateCenter();
	}

	public IShape clone(){
		RegularPolygon r = new RegularPolygon(nbSide, lenghtSide, position);
		return r;
	}

	public void updateRotateCenter(){

	}

	public int getNbSide() {
		return nbSide;
	}


	public void setNbSide(int nbSide) {
		this.nbSide = nbSide;
		this.updateObservers();
	}


	public double getLenghtSide() {
		return lenghtSide;
	}


	public void setLenghtSide(double lenghtSide) {
		this.lenghtSide = lenghtSide;
		this.updateObservers();
	}

	@Override
	public Iterator<IShape> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
