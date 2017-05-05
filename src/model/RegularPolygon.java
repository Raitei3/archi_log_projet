package model;

import java.awt.Color;
import java.awt.Point;
import java.util.Iterator;

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
		saveNotify();
		this.nbSide = nbSide;
		drawNotify();
	}


	public double getLenghtSide() {
		return lenghtSide;
	}


	public void setLenghtSide(double lenghtSide) {
		saveNotify();
		this.lenghtSide = lenghtSide;
		drawNotify();
	}


	public IShape copy() {
		RegularPolygon r = new RegularPolygon(nbSide, lenghtSide, position);
		return r;
	}

	public void addShape(IShape s) {
		throw new UnsupportedOperationException();
	}

	public void removeShape(IShape s) {}

		public void accept(IVisitor v) {
		v.visit(this);
	}
}
