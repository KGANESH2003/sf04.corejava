package edu.svit.sf04corejava.statickeyword;

public class MyClassMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass objOne = new MyClass();
		System.out.println(objOne);
		MyClass.show();
		
		MyClass objTwo = new MyClass();
		System.out.println(objTwo);
		
		System.out.println("static memeber: "+MyClass.srNo);

	}

}
