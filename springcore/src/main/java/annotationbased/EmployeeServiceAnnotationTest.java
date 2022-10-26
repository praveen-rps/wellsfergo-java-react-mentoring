package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kindrylspringcore.EmpsConfigs;

public class EmployeeServiceAnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 *  ServiceTest service
		 * = context.getBean(ServiceTest.class);
		 * 
		 * System.out.println(service.showServiceType());
		 */
		ApplicationContext context = 
		new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		
		//ServiceTest service = context.getBean(ServiceTest.class);

		//System.out.println(service.showServiceType());
		
		DbConnnect db = (DbConnnect) context.getBean("dbs");
		db.displayConnectionDetails();
		
		
	}

}
