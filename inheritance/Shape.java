package com.inheritance;
//Create a class Shape with methods getArea() and getPerimeter().
//Create two subclasses Circle and Rectangle, which override getArea() and getPerimeter()
//to compute their respective values. Create objects of both subclasses and call their methods.
public class Shape {
    
	public void getArea() {
		System.out.println("This is shape area");
	}
	public void getPerimeter() {
		System.out.println("This is shape perimeter");
	}
}
class Circle extends Shape{
	final float pi = 3.14f;
	
	
	
	public float getArea(float r) {
		float area = pi*(r*r);
		return area;
	}
	public float getPerimeter(float r) {
		float perimeter = 2*pi*r;
		return perimeter;
	}
}
class Rectangle extends Shape{
	public float getArea(float l,float b) {
		float area = l*b;
		return area;
	}
	public float getPerimeter(float l,float b,float h) {
		float perimeter = l*b;
		return perimeter;
	}
}
