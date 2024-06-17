package edu.svit.sf04corejava.statickeyword;


public class Employee {

	//non static variable or instance variable
		private int id;
		private String name;
		
		//static variable or class variable
		private static String company="IBM";

		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name +", company=" +company+" ]";
		}
		
		
		
		
		
}
