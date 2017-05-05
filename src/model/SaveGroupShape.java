package model;

import java.awt.Point;
import java.util.ArrayList;


public class SaveGroupShape extends GroupShape {


	private static final long serialVersionUID = -210732678534342420L;

	public SaveGroupShape() {
		super(new Point (0,0));

	}
	
	
	public Object createMemento(){
		//Memento tmp = new Memento(this.arrayShape);
		//System.out.println(tmp.States.);
		return new Memento(this.arrayShape);
	}
	
	public void setMemento(Object m){
		if(m instanceof Memento)
		arrayShape = ((Memento) m).getState();
		for( IShape s : arrayShape){
			s.drawNotify();
		}
	}
	
	
	
	private static class Memento {
		
		private ArrayList<IShape> States;
		
		public Memento(ArrayList<IShape> shapes){
			States = new ArrayList<IShape>();
			for(IShape s : shapes){
				States.add(s.copy());
			}
		}
		
		public ArrayList<IShape> getState(){
			return States;
		}
		
	}

	
	
}
