package com.cg.Java_assignment.Assignment2;

public class ass2_6 {
	public static void main(String[] args) {
		FilePersistance fp = new FilePersistance();
		fp.persist();
		DataPersistance dp = new DataPersistance();
		dp.persist();
	}
}
abstract class Persistance{
	abstract void persist();
}
class FilePersistance extends Persistance{
	public void persist() {
		System.out.println("In file");
	}
}
class DataPersistance extends Persistance{
	public void persist() {
		System.out.println("In Data");
	}
}