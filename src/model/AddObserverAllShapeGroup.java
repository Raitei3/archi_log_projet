package model;

import controller.DrawObserver;

public class AddObserverAllShapeGroup implements IVisitor {
	
	DrawObserver o;

	public AddObserverAllShapeGroup(DrawObserver o) {
		this.o = o;
	}

	public void visit(Rect r) {
		r.addObserver(o);
	}

	public void visit(RegularPolygon r) {
		r.addObserver(o);
	}
	
	public void visit(GroupShape g) {
	}

}
