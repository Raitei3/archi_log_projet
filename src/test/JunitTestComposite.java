package test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.awt.Point;

import org.junit.Test;

import model.GroupShape;
import model.IShape;
import model.Rect;

public class JunitTestComposite {

	@Test
	public void testTranslate() {
		Point p1, p2, res1;
		IShape s1, s2;
		GroupShape gs = new GroupShape(new Point(0,0));
		int trans = 100;
		p1 = new Point(10, 10);
		p2 = new Point(20, 20);
		s1 = new Rect(p1, 10, 10);
		s2 = new Rect(p2, 10, 10);

		gs.addShape(s1);
		gs.addShape(s2);

		gs.translate(trans, trans);

		res1 = new Point(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y));

		assertTrue("2 shapes (10,10) & (20,20) with a translation of 100, the position of the group should be (110,110)", gs.getPosition().equals(res1));
	}

	@Test
	public void testUpdatePosition() {
		Point p1, p2, p3, res1, res2;
		IShape s1, s2, s3;
		GroupShape gs = new GroupShape(new Point(0,0));

		p1 = new Point(10, 10);
		p2 = new Point(20, 20);
		p3 = new Point(5, 15);
		s1 = new Rect(p1, 10, 10);
		s2 = new Rect(p2, 10, 10);
		s3 = new Rect(p3, 10, 10);

		res1 = new Point(Math.min(p1.x, p2.x), Math.min(p1.y, p2.y));

		gs.addShape(s1);
		gs.addShape(s2);
		assertTrue("2 shapes (10,10) & (20,20), the position of the group should be (10,10)", gs.getPosition().equals(res1));

		gs.addShape(s3);
		res2 = new Point(Math.min(Math.min(p1.x, p2.x), p3.x), Math.min(Math.min(p1.y, p2.y), p3.y));
		assertTrue("a new shape is added (5,15) the pos should be (5, 10)", gs.getPosition().equals(res2));

		gs.removeShape(s3);
		assertTrue("Removing a shape", gs.getPosition().equals(res1));
	}

	@Test
	public void testUpdateRotateCenter() {
		Point p1, p2, res1;
		IShape s1, s2;
		GroupShape gs = new GroupShape(new Point(0,0));
		int trans = 100;
		p1 = new Point(10, 10);
		p2 = new Point(20, 20);
		s1 = new Rect(p1, 10, 10);
		s2 = new Rect(p2, 10, 10);

		gs.addShape(s1);
		gs.addShape(s2);
		int rcx = s1.getRotateCenter().x + s2.getRotateCenter().x;
		int rcy = s1.getRotateCenter().y + s2.getRotateCenter().y;

		res1 = new Point(rcx/2, rcy/2);

		assertTrue("2 shapes (10,10) & (20,20), the rotate center of the group should be ((10+20)/2, (10+20/2))", gs.getRotateCenter().equals(res1));
	}

	@Test
	public void testAddShape() {
		Point p1, p2;
		IShape s1, s2;
		GroupShape gs = new GroupShape(new Point(0,0));

		p1 = new Point(10, 10);
		p2 = new Point(20, 20);
		s1 = new Rect(p1, 10, 10);
		s2 = new Rect(p2, 10, 10);

		gs.addShape(s1);
		gs.addShape(s2);
		assertTrue("add 2 rectangles", gs.getArray().contains(s1)&gs.getArray().contains(s2));
	}

	@Test
	public void testRemoveShape() {
		Point p1, p2;
		IShape s1, s2;
		GroupShape gs = new GroupShape(new Point(0,0));

		p1 = new Point(10, 10);
		p2 = new Point(20, 20);
		s1 = new Rect(p1, 10, 10);
		s2 = new Rect(p2, 10, 10);

		gs.addShape(s1);
		gs.removeShape(s1);
		assertTrue("Add 2 rectangle and removing one", !gs.getArray().contains(s1));

		gs.addShape(s1);
		gs.addShape(s2);
		gs.removeShape(s1);
		gs.removeShape(s2);
		assertTrue("Add 2 rectangle and removing both of them", gs.getArray().isEmpty());

		gs.addShape(s2);
		gs.removeShape(s1);
		assertTrue("Removing a shape not in the group", !gs.getArray().contains(s1));

		gs.removeShape(s2);
		gs.removeShape(s1);
		gs.removeShape(s2);
		assertTrue("Removing shapes of an empty list", gs.getArray().isEmpty());
	}

}
