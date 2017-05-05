package model;

public interface IVisitor {
	/**
	 * Nos Visiteurs nous permette d'ajouter les Observers à nos Shapes
	 */
	public void visit(Rect r);
	public void visit(RegularPolygon r);
	public void visit(GroupShape g);
}
