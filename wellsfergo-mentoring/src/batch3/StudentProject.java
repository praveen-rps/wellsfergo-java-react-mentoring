package batch3;

import java.util.List;
import java.util.Scanner;

class Student{
	int htno;
	String name;
	String branch;
	public Student() {
		
	}
	
	public Student(int htno, String name, String branch) {
		super();
		this.htno = htno;
		this.name = name;
		this.branch = branch;
	}

	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public String toString() {
		return this.htno+" "+this.name+" "+this.branch;
	}
	
}

public class StudentProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		StudentOps service = new StudentOps();
		System.out.println("Enter htno");
		int htno=scanner.nextInt();
		System.out.println("Enter name");
		String name=scanner.next();
		System.out.println("Enter branch");
		String branch=scanner.next();
		
		service.addStudent(new Student(htno,name,branch));
		
		List<Student> data = service.returnAllStudents();
		data.forEach(System.out::println);
		

	}

}
