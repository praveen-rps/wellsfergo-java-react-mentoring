package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		ServiceTest service = (ServiceTest) context.getBean(ServiceTest.class);
		
		System.out.println(service.showServiceType());
	}

}
