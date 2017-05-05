package controller;

import model.IShape;
import model.ShapeObserver;

public interface ShapeDrawer extends ShapeObserver {
	public void draw(IShape s);
}
