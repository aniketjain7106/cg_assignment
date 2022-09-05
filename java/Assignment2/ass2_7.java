package com.cg.Java_assignment.Assignment2;

import java.util.Scanner;

public class ass2_7 {
	public static void main(String[] args) {
		DesertShop ds = new item();
		while(true){
			System.out.println("Enter owner or customer or exit");
			Scanner sc = new Scanner(System.in);
			String s=sc.next();
			if (s.equals("owner")) {
				System.out.println("Enter product and quantity to increase");
				String p=sc.next();
				int q=sc.nextInt();
				ds.getQuantity(p,q);
				System.out.println("Quantity added");
			}
			else if (s.equals("customer")) {
				System.out.println("Enter product and quantity to buy");
				String p=sc.next();
				int q=sc.nextInt();
				ds.getPrice(p,q);
			}
			else {
				break;
			}
		}
	}
}
abstract class DesertShop{
	abstract void getQuantity(String s,int x);
	abstract void getPrice(String s,int X);
}
class item extends DesertShop{
	int candy=0;
	int cookie=0;
	int icecream=0;
	
	public void getQuantity(String s,int x) {
		if (s.equals("candy"))
			candy+=x;
		else if (s.equals("candy"))
			cookie+=x;
		else if (s.equals("candy"))
			icecream+=x;
	}
	public void getPrice(String s, int x) {
		if (s.equals("candy")) {
			this.candy-=x;
			System.out.println("your price is " + x*1+" dollar");
		}
		else if (s.equals("cookie")){
			this.cookie-=x;
			System.out.println("your price is " + x*5+" euro");
		}
		else if (s.equals("icecream")){
			this.icecream-=x;
			System.out.println("your price is " + x*10+" icecream");
		}
	};
}