package model;

public interface IVisitor {

	public void visit(Rect r);
	public void visit(RegularPolygon r);
	public void visit(GroupShape g);
}
