package model;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GroupShape extends AbstractShape {

	private static final long serialVersionUID = -7087899022160560034L;

	protected ArrayList<IShape> arrayShape;

	public GroupShape(Point pos){
		super(pos);
		this.arrayShape = new ArrayList<IShape>();
		this.rotateCenter = new Point(0, 0);
	}

	public  GroupShape(GroupShape shape){
		super(shape);
		this.arrayShape = new ArrayList<IShape>(shape.arrayShape.size());
		for (IShape s : shape.arrayShape)
			this.arrayShape.add(s.copy());
	}

	public ArrayList<IShape> getArray(){
		return this.arrayShape;
	}

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

	public void addShape(IShape s){
		this.arrayShape.add(s);
		this.updatePosition();
		this.updateRotateCenter();
	}

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

	public IShape copy() {
		return new GroupShape(this);
	}

	@Override
	public void accept(IVisitor v) {
		for(IShape s : arrayShape){
			s.accept(v);
		}
		v.visit(this);
	}

	public Iterator<IShape> iterator () {
		ArrayList<IShape> shapes = new ArrayList<IShape>(this.arrayShape);
		return shapes.iterator();
	}
}
