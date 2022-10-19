package batch4;



public class Employee {//implements Comparable<Employee>{
	
	int id;
	String name;
	String dept;
	public Employee() {
		
	}
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	/*
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		
		if(this.id > o.id)
			return -1;
		else if(this.id < o.id)
			return 1;
		else
			return 0;
		//return this.dept.compareTo(o.dept);
	}
	*/
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.dept;
	}
	
	/*
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object Obj) {
		
		 if (Obj instanceof Employee) {
		        Employee another = (Employee) Obj;
		        if (this.id==another.id &&
		            this.name.equals(another.name) && this.dept.equals(another.dept))  {
		                return true;
		        }
		    }
		 return false;
	}
	*/

}
