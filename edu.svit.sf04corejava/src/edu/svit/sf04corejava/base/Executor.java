package edu.svit.sf04corejava.base;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base bOne = new Base();
		//bOne.variablePrivate; //variable private is not visible outside the class
		System.out.println(bOne.variableDefault);
		
		System.out.println(bOne.variableProtected);
		
		System.out.println(bOne.variablePublic);
		

	}

}

