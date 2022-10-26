package kindrylspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean.xml");
		
	//	Employee emp = (Employee) context.getBean("employee");
	//	Employee emp1 = (Employee) context.getBean("employee");
	//	System.out.println(emp);
	//	System.out.println(emp1);
		Address address1 = (Address) context.getBean("addr");
		System.out.println(address1);
				
		/*
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(EmployeeConfigurations.class);
		
		Address address1 = (Address) context.getBean("chennai");
		System.out.println(address1);
		
		
		Employee employee = (Employee) context.getBean(Employee.class);
		System.out.println(employee);
		*/
		
		

	}

}
