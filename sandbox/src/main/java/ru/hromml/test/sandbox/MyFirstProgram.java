package ru.hromml.test.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("world");
		hello("sas");
		hello("wow");
		double length = 5;
		double length2 = 6;
		System.out.println("ploshad = "+area(length)+" and "+area(length,length2));
	}
	public static void hello(String newstring){
		System.out.println("Hello, "+newstring);
	}
	public static double area(double l){
		return l*l;
	}
	public static double area(double l1,double l2){
		return l1*l2;
	}
}