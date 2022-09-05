package com.cg.Java_assignment.Assignment2;

public class ass2_2 {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.calculateSalary(50);
		Labour l = new Labour();
		l.calculateSalary(45);
	}
}
class Employee{
	void calculateSalary(int hour) {
		System.out.println("Your salary is ");
	}
}
class Manager extends Employee{
	void calculateSalary(int hour) {
		if (hour>45)
			System.out.println("Total salary is "+(45*1000+(hour-45)*1200));
		else
			System.out.println("Total salary is "+(hour*1000));
	}
}
class Labour extends Employee{
	void calculateSalary(int hour) {
		if (hour>45)
			System.out.println("Total salary is "+(45*500+(hour-45)*700));
		else
			System.out.println("Total salary is "+(hour*500));
	}
}