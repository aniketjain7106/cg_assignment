package com.cg.Java_assignment.Assignmnet3;

public class ass3 {
	public static void main(String[] args) {
		String s ="Hello World";
		System.out.println(s.length());
		String t="Hello";
		String x = " how are you";
		System.out.println(t+x);
		String st="Java String pool refers to collection of Strings which are stored in heap memeory";
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.replace("a", "$"));
		System.out.println(st.contains("collection"));
		System.out.println(st.equals("java string pool refers to collection of strings which are stored in heap memeory "));
		
		StringBuffer sb= new StringBuffer("StringBuffer");
		sb.append(" is a peer class of String.");
		sb.append(" that provides much of ");
		sb.append("the functionality of strings");
		System.out.println(sb);
		StringBuffer sb1= new StringBuffer("it is used to at the specified index position");
		sb1.insert(13," insert text");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		StringBuilder sb2= new StringBuilder("StringBuffer");
		sb2.append(" is a peer class of String.");
		sb2.append(" that provides much of ");
		sb2.append("the functionality of strings");
		System.out.println(sb2);
		StringBuffer sb3= new StringBuffer("it is used to at the specified index position");
		sb3.insert(13," insert text");
		System.out.println(sb3);
		System.out.println(sb3.reverse());
	}
}
