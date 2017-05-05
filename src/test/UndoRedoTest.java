package test;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import controller.DrawObserver;
import controller.UndoRedoController;
import model.IShape;
import model.Rect;
import model.SaveGroupShape;

public class UndoRedoTest {
	
	UndoRedoController o;
	SaveGroupShape group;
	IShape r1;
	IShape r2;
	int i;
	Point p1;
	Point p2;
	Point p3;
	
	@Before
	public void setUp() throws Exception{
		
		p1 = new Point(0,0);
		p2 = new Point(10,10);
		p3 = new Point(20,20);
		
		o = new UndoRedoController();
		group = new SaveGroupShape();
		r1 = new Rect(new Point(0,0),20,20);
		r2 = new Rect(new Point(0,0),20,20);
		group.addShape(r1);
		group.addShape(r2);
		r1.addObserver(o);
		r2.addObserver(o);
		o.addGroup(group);
	}

	@Test
	public void test() {
		
		
		r1.setPosition(p2);
		r2.setPosition(p3);
		
		o.undo();
		i =1;
		for(IShape s : group){
			if(i == 1){
				org.junit.Assert.assertEquals(p2.getX(),s.getPosition().getX(),0.1);
				org.junit.Assert.assertEquals(p2.getY(),s.getPosition().getY(),0.1);
			}
			else{
				org.junit.Assert.assertEquals(p1.getX(),s.getPosition().getX(),0.1);
				org.junit.Assert.assertEquals(p1.getY(),s.getPosition().getY(),0.1);
			}
			i++;
		}
		
		
		o.undo();
		i =1;
		for(IShape s : group){
			if(i == 1){
				org.junit.Assert.assertEquals(p1.getX(),s.getPosition().getX(),0.1);
				org.junit.Assert.assertEquals(p1.getY(),s.getPosition().getY(),0.1);
			}
			else{
				org.junit.Assert.assertEquals(p1.getX(),s.getPosition().getX(),0.1);
				org.junit.Assert.assertEquals(p1.getY(),s.getPosition().getY(),0.1);
			}
			i++;
		}
		
		
		o.redo();
		i =1;
		for(IShape s : group){
			if(i == 1){
				org.junit.Assert.assertEquals(p2.getX(),s.getPosition().getX(),0.1);
				org.junit.Assert.assertEquals(p2.getY(),s.getPosition().getY(),0.1);
			}
			else{
				org.junit.Assert.assertEquals(p1.getX(),s.getPosition().getX(),0.1);
				org.junit.Assert.assertEquals(p1.getY(),s.getPosition().getY(),0.1);
			}
			i++;
		}
	}

}
