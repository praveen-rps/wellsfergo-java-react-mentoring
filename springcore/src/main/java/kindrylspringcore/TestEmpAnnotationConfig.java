package kindrylspringcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpAnnotationConfig {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext context = 
			//	new AnnotationConfigApplicationContext(EmpsConfigs.class);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		EmpServiceImpl esi = (EmpServiceImpl)context.getBean(EmpServiceImpl.class);
		esi.getServiceType();
	}

}
