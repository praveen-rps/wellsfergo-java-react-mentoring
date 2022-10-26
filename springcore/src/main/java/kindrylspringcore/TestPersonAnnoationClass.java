package kindrylspringcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPersonAnnoationClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(EmpConfiguration.class);
		Person p = (Person) context.getBean("per");
		System.out.println(p);
		
		Address a = (Address) context.getBean("addr");
		System.out.println(a);
	
	}

}
