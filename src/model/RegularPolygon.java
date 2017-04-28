package model;

import java.awt.Color;
import java.awt.Point;

public class RegularPolygon extends AbstractShape {


	private static final long serialVersionUID = 7543238170523336842L;
	
	public int nbSide;
	public double lenghtSide;


	public RegularPolygon( int nbS, double ls, Point pos){
		super(pos);
		this.color = Color.BLACK;
		this.nbSide = nbS;
		this.lenghtSide = ls;
		this.updateRotateCenter();
	}

	public void updateRotateCenter(){

	}

	public int getNbSide() {
		return nbSide;
	}


	public void setNbSide(int nbSide) {
		this.nbSide = nbSide;
		notify();
	}


	public double getLenghtSide() {
		return lenghtSide;
	}


	public void setLenghtSide(double lenghtSide) {
		this.lenghtSide = lenghtSide;
		notify();
	}


	public IShape copy() {
		RegularPolygon r = new RegularPolygon(nbSide, lenghtSide, position);
		return r;
	}

	public void addShape(IShape s) {
		throw new UnsupportedOperationException();	
	}

	public void removeShape(IShape s) {}
	
		public void accept(AddObserverAllShapeGroup v) {
		v.visit(this);
	}

}
