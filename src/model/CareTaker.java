package model;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	

	private List<Object> mementoList = new ArrayList<Object>();

	public void add(Object state) {
		mementoList.add(state);
	}

	public Object get(int index) {
		return mementoList.get(index);
	}
}
