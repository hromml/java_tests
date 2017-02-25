package ru.hromml.test.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		hello("sas");
		hello("wow");
		Square s= new Square(5);
		Rectangle r = new Rectangle(6,7);
		Point p1 = new Point(1,1,2,2);
		//System.out.println("ploshad = "+s.area()+" and "+area(r));
		System.out.println("Raastoyanie mezhdu tochkami = " + p1.distance());
	}
	public static void hello(String newstring){
		System.out.println("Hello, "+newstring);
	}
	public static double area(Rectangle r){
		return r.l1*r.l2;
	}
}