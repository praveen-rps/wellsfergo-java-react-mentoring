package kindrylspringcore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfigurations {
	
	
	@Bean(name="mumbai")
	
	public Address returnNewAddressObject1() {
		return new Address(521,"Mahe","Mumbai");
	}
	
	
	@Bean(name="chennai")
	public Address returnNewAddressObject2() {
		return new Address(999,"T Nagar","Chennai");
	}
	
	
	@Bean
	public Employee returnNewEmployeeObject() {
		List<String> degrees = new ArrayList<>();
	return new Employee("8888", "Kumar","Sales", returnNewAddressObject1(), degrees);
		
	}
	

}
