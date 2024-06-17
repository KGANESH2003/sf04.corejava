package edu.svit.sf04corejava.statickeyword;


public class MyClass {

	private int section;
	
	 static int srNo;
	
	//static block
	static {
		System.out.println("within static block...");
		srNo=1000;
		
	}

	MyClass(){
		System.out.println("within default construtor..");
		srNo++;
	}
	
	//static method
	public static void show() {
		System.out.println(srNo);
		//System.out.println(section); //static members cannot access non static member
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + ", srNo=" +srNo+ "]";
	}
	

}
