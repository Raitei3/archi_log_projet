package controller;

import model.ShapeObserver;

public interface UndoRedo extends ShapeObserver {
	
	public void undo();
	public void redo();
	public void save();
}
