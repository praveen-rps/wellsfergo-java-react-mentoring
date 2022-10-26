package kindrylspringcore;

import java.util.List;

public class Employee {

	String empid;
	String name;
	String dept;
	List<String> degrees;
	
	public List<String> getDegrees() {
		return degrees;
	}

	public void setDegrees(List<String> degrees) {
		this.degrees = degrees;
	}

	Address address;
	public Employee() {

	}

	public Employee(String empid, String name, String dept, Address address, List degress) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.address=address;
		this.degrees=degress;
	}

	public String getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + ", degrees=" + degrees + ", address="
				+ address + "]";
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	

}
