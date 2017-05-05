package controller;

import model.CareTaker;
import model.EventType;
import model.IShape;
import model.SaveGroupShape;

public class UndoRedoController implements UndoRedo{
	CareTaker undo;
	CareTaker redo;
	SaveGroupShape shapes;
	/**
	 * Création des piles servant à l'undo et au redo
	 */
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
	 /**
	  * Sauvegarde l'état d'un groupe de forme en l'empilant sur la pile "undo"
	  * afin de pouvoir restaurer les états précédents.
	  */
	public void save(){
		undo.push(shapes.createMemento());
	}

	/**
	 * Prend le dernier état de la pile undo et l'empile sur la pile redo
	 */
	public void undo(){
		redo.push(shapes.createMemento());
		Object tmp = undo.pop();
		if(tmp != null){
		shapes.setMemento(tmp);
		}
	}
	/**
	 * Prend le dernier état de la pile redo et l'empile sur la pile undo
	 */
	public void redo(){
		undo.push(shapes.createMemento());
		Object tmp = redo.pop();
		if(tmp!=null){
		shapes.setMemento(tmp);
		}
	}
}
