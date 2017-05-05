package controller;

import model.CareTaker;
import model.EventType;
import model.IShape;
import model.SaveGroupShape;

public class UndoRedoController implements UndoRedo{
	CareTaker undo;
	CareTaker redo;
	SaveGroupShape shapes;
	
	public UndoRedoController(){
		undo = new CareTaker ();
		redo = new CareTaker ();
	}
	
	public void addGroup(SaveGroupShape shape){
		shapes = shape;
	}

	public void update(IShape s) {
		if(s.getEvent()== EventType.SAVE){
		save();
		}
	}
	
	public void save(){
		undo.push(shapes.createMemento());
	}
	
	public void undo(){
		redo.push(shapes.createMemento());
		Object tmp = undo.pop();
		if(tmp != null){
		shapes.setMemento(tmp);
		
		}
		//draw();
	}
	
	public void redo(){
		undo.push(shapes.createMemento());
		Object tmp = redo.pop();
		if(tmp!=null){
		
		shapes.setMemento(tmp);
		}
		//draw();
	}
}
