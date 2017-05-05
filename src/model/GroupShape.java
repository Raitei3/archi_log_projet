package model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GroupShape extends AbstractShape {

	private static final long serialVersionUID = -7087899022160560034L;

	protected ArrayList<IShape> arrayShape; //Liste de formes

	public GroupShape(Point pos){
		super(pos);
		this.arrayShape = new ArrayList<IShape>();
		this.rotateCenter = new Point(0, 0); //La liste étant vide, on initialise le centre de rotation en (0,0)
	}

	/**
	 * Crée un GroupShape à partir d'un autre
	 * en utilisant la fonction de clonage de GroupShape
	 */

	public  GroupShape(GroupShape shape){
		super(shape);
		this.arrayShape = new ArrayList<IShape>(shape.arrayShape.size());
		for (IShape s : shape.arrayShape)
			this.arrayShape.add(s.copy());
	}

	public ArrayList<IShape> getArray(){
		return this.arrayShape;
	}

	/**
	 * Ajout de Shape dans GroupShape
	 * A chaque ajout on met à jour la position et le centre de rotation du GroupShape
	 *
	 */

	public void addShape(IShape s){
		this.arrayShape.add(s);
		this.updatePosition();
		this.updateRotateCenter();
	}

	/**
	 * Suppression d'une Shape du GroupShape
	 * A chaque suppression on met à jour la position et le centre de rotation du GroupShape
	 *
	 */
	public void removeShape(IShape s){
		arrayShape.remove(s);
		if(this.arrayShape.isEmpty()){
			this.position = new Point(0, 0);
			this.rotateCenter = new Point(0, 0);
		}else{
			this.updatePosition();
			this.updateRotateCenter();
		}
	}

	/**
	 * updatePosition() met à jour la position du GroupShape en fonction des Shape qu'il contient.
	 * La position en x du GroupShape sera la position en x la plus petite de toutes les Shape du GroupShape
	 * Il en est de même pour la position en y.
	 *
	 */
	private void updatePosition(){
		Point pos = this.arrayShape.get(0).getPosition();
		int x = pos.x;
		int y = pos.y;

		for(IShape shape : this.arrayShape){
			pos = shape.getPosition();
			if(pos.x < x)
				x = pos.x;
			if(pos.y < y)
				y = pos.y;
		}
		this.setPosition(new Point(x, y));
	}

	/**
	 * updateRotateCenter() met à jour le centre de rotation du GroupShape
	 * Pour cela on fait la moyenne du rotateCenter de toutes les Shapes du GroupShape
	 *
	 */
	public void updateRotateCenter(){
		int size = this.arrayShape.size();
		int sumx = 0;
		int sumy = 0;

		for(IShape s : this.arrayShape){
			sumx += s.getRotateCenter().x;
			sumy += s.getRotateCenter().y;
		}

		sumx /= size;
		sumy /= size;
		Point c = new Point(sumx, sumy);

		this.rotateCenter.setLocation(c);
	}

	/**
	 * translate(int x, int y) permet d'appliquer une translation à toutes les Shapes du GroupShape
	 * Après avoir translaté toutes les formes, on met à jour la position et le centre de rotation du GroupShape
	 *
	 */
	public void translate(int x, int y){
		for(IShape shape : this.arrayShape)
			shape.translate(x, y);
		this.updatePosition();
		this.updateRotateCenter();
	}

	public Color getColor(){
		throw new UnsupportedOperationException();
	}

	public void setColor(Color c){
		for(IShape s : this.arrayShape)
			s.setColor(c);
	}

	public double getRotation(){
		throw new UnsupportedOperationException();
	}

	public void setRotation(double r){
		for(IShape s : this.arrayShape)
			s.setRotation(r);
	}

	/**
	 * Retourne un clone de l'instance GroupShape
	 */
	public IShape copy() {
		return new GroupShape(this);
	}
	/**
	 * Toutes les Shapes du GroupShape accept un visiteur qui va ensuite pouvoir les visiter
	 *
	 */
	@Override
	public void accept(IVisitor v) {
		for(IShape s : arrayShape){
			s.accept(v);
		}
		v.visit(this);
	}

	/**
	 * Iterateur qui permet de cacher la représentation du GroupShape
	 */
	public Iterator<IShape> iterator () {
		ArrayList<IShape> shapes = new ArrayList<IShape>(this.arrayShape);
		return shapes.iterator();
	}
}
