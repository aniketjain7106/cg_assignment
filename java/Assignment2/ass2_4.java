package com.cg.Java_assignment.Assignment2;

public class ass2_4 {
	public static void main(String[] args) {
		A a = new B();
		a.a();	
	}
}
abstract class A{
	abstract void a();
}
class B extends A{
	void a() {
		System.out.println("Hello");
	}
}