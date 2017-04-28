package model;

public class AddObserverAllShapeGroup implements IVisitor {
	
	ModelObserver o;

	public AddObserverAllShapeGroup(ModelObserver o) {
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
