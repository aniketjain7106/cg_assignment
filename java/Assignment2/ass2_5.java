package com.cg.Java_assignment.Assignment2;

public class ass2_5 {
	public static void main(String[] args) {
		square s = new square();
		s.draw();
	}
}
class shape{
	public void draw() {
	}
}
class circle extends shape{
	public void draw() {
		System.out.println("Draw circle");
	}
}
class rectangle extends shape{
	public void draw() {
		System.out.println("Draw rectangle");
	}
}
class square extends shape{
	public void draw() {
		System.out.println("Draw square");
	}
}