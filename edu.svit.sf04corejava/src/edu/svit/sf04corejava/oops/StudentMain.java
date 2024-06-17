package edu.svit.sf04corejava.oops;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//className objNmae=new className(); //using default constructor
				Student studentOne= new Student();
				System.out.println(studentOne);
				
				//using parameterized constructor
				Student studentTwo = new Student(101,"Rahul","CSE","Bangalore");
				System.out.println(studentTwo);
				
				//using scanner class
				Student studentThree = new Student();
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter the student details");
				int id=sc.nextInt();
				String name=sc.next();
				sc.nextLine();
				String department=sc.nextLine();
				String location=sc.nextLine();
				
				studentThree.setId(id);
				studentThree.setName(name);
				studentThree.setDepartment(department);
				studentThree.setLocation(location);
				
				System.out.println(studentThree);
				
				
				
				

	}

}
