package batch3;

import java.util.List;

public interface IStudents {
	public String addStudent(Student student);
	public String deleteStudent(int htno);
	public List<Student> returnAllStudents();
	public Student searchStudent(int htno);
}
