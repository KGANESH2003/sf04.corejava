package edu.svit.sf04corejava.inheritence;

public class Student extends Citizen {
		private int studentId;
		private String name;
		private String department;
		private String proctor;
		
		public Student(long aadharNo, long voterId, String nationality, int studentId, String name, String department,
				String proctor) {
			super(aadharNo, voterId, nationality);
			this.studentId = studentId;
			this.name = name;
			this.department = department;
			this.proctor = proctor;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", name=" + name + ", department=" + department + ", proctor="
					+ proctor + ", getAadharNo=" + getAadharNo() + ", getVoterId=" + getVoterId()
					+ ", getNationality=" + getNationality() + "]";
		}

		
		
		
		
		
		

	}



