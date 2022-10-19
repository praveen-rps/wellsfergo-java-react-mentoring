package batch3;

import java.util.ArrayList;
import java.util.List;

public class StudentOps implements IStudents{
	
	ArrayList<Student> students;
	public StudentOps(){
		students= new ArrayList<>();
	}
	@Override
	public String addStudent(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		return "added";
	
	}
	@Override
	public String deleteStudent(int htno) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Student> returnAllStudents() {
		// TODO Auto-generated method stub
		return this.students;
	}
	@Override
	public Student searchStudent(int htno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
