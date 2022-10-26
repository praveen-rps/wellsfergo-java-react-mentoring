package annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tester {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-hello.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		System.out.println(helloWorld.getMessage1());
		System.out.println(helloWorld.getMessage2());
	}
}
