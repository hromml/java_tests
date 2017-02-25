package ru.hromml.test.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		hello("sas");
		hello("wow");
		Square s= new Square(5);
		Rectangle r = new Rectangle(6,7);
		System.out.println("ploshad = "+area(s)+" and "+area(r));
	}
	public static void hello(String newstring){
		System.out.println("Hello, "+newstring);
	}
	public static double area(Square s){
		return s.l*s.l;
	}
	public static double area(Rectangle r){
		return r.l1*r.l2;
	}
}