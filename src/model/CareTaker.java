package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
	
	

	private Stack<Object> mementoPile = new Stack<Object>();
	
	public CareTaker(){
		mementoPile = new Stack<Object>();
	}

	public void push(Object state) {
		mementoPile.push(state);
	}

	public Object pop() {
		if(mementoPile.isEmpty()){
			return null;
		}
		return mementoPile.pop();
	}
}
