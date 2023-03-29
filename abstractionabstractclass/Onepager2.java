package com.abstractionabstractclass;
abstract class Shape{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
} 
public class Onepager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
	}

}
