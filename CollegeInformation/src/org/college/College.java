package org.college;

public class College {
public static void main(String[] args) {
		College col = new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		
		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		
		Hostel.hostelName();
		dept.deptName();
		

	}
	
	public void collegeName() {
		System.out.println("This denotes collegeName");
	}
	public void collegeCode() {
		System.out.println("This denotes collegeCode");
	}	
	public void collegeRank() {
		System.out.println("This denotes collegeRank");
	}

}


 class Student {
	 public void studentName() {
			System.out.println("This denotes studentName");
		}
	 public void studentDept() {
			System.out.println("This denotes studentDept");
		}
	 public void studentId() {
			System.out.println("This denotes studentId");
		}
 }
 
 
 class Hostel {
	 public static void hostelName() {
			System.out.println("This denotes hostelName");
		}
 }
 
 class dept {
	 public static void deptName() {
			System.out.println("This denotes deptName");
		}
 }
