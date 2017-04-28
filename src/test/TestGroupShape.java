package test;

import java.awt.Point;

import model.Rect;
import model.IShape;
import model.GroupShape;

public class TestGroupShape {
	public static void main(String[] args) {
		IShape s1 = new Rect(new Point(20,20), 10, 10);

		System.out.println("On crée un rectangle s1 tel que sa position est x = "+s1.getPosition().getX()+" et sa position en y est y = "+s1.getPosition().getY());

		IShape s2 = new Rect(new Point(10, 10), 10, 10);

		System.out.println("On crée un rectangle s2 tel que sa position est x = "+s2.getPosition().getX()+ " et sa position en y est y = "+s2.getPosition().getY()+"\n");

		GroupShape sg = new GroupShape(new Point(0, 0));
		sg.addShape(s1);
		System.out.println("On ajoute s1 a sg, donc on update les positions,  position x = "+sg.getPosition().getX()+" y = "+sg.getPosition().getY()+" de centre de rotation x = "+sg.getRotateCenter().x+" y = "+sg.getRotateCenter().y+"\n");

		sg.addShape(s2);
		System.out.println("On ajoute s2 a sg, donc on update les positions,  position x = "+sg.getPosition().getX()+" y = "+sg.getPosition().getY()+" de centre de rotation x = "+sg.getRotateCenter().x+" y = "+sg.getRotateCenter().y+"\n" );

		sg.translate(10, 10);
		System.out.println("On applique une translation à sg 10 en x et 10 en y, x = "+sg.getPosition().getX()+" y = "+sg.getPosition().getY()+" de centre de rotation x = "+sg.getRotateCenter().x+" y = "+sg.getRotateCenter().y+"\n");
		System.out.println("-------------------------");

		sg.removeShape(s1);
		System.out.println("On enlève s1 de sg \n ");
		System.out.println("x = "+sg.getPosition().getX()+" y = "+sg.getPosition().getY()+" de centre de rotation x = "+sg.getRotateCenter().x+" y = "+sg.getRotateCenter().y+"\n");
		System.out.println("-------------------------");

		sg.removeShape(s2);
		System.out.println("On enlève s2 de sg \n ");
		System.out.println("x = "+sg.getPosition().getX()+" y = "+sg.getPosition().getY()+" de centre de rotation x = "+sg.getRotateCenter().x+" y = "+sg.getRotateCenter().y+"\n");
	}

}
