package edu.svit.sf04corejava.executor;

import edu.svit.sf04corejava.base.Base;

public class ExecutorOne extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base bOne= new Base();
		//bOne.varPrivate;
		
		//default varible are not accessible outside the package
		//System.out.println(bOne.varDefault);
		
		ExecutorOne ex = new ExecutorOne();
		System.out.println(ex .variableProtected);
		
		System.out.println(bOne.variablePublic);
		

	}

}
