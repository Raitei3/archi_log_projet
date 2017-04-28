package model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public abstract class ShapeObservableAbstract implements IShape {
	
	private List<ShapeObserver> observersList = new LinkedList<ShapeObserver>();
	private Set<ShapeObserver> observersSet = new HashSet<ShapeObserver>();

	public void addObserver(ShapeObserver o){
		if(!observersSet.contains(o)){
			observersList.add(o);
			observersSet.add(o);
		}
	}
	
	public void RemoveObserver(ShapeObserver o){
		observersList.remove(o);
		observersSet.remove(o);
	}
	
	public void notifyObserver(){
		for(ShapeObserver o : observersList)
			o.update(this);
	}
	
	
}
