package kindrylspringcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfiguration {
	
	@Bean("addr")
	public Address getAddress() {
		return new Address(987,"T Nagar", "Chennai");
	}
	
	@Bean("per")
	public Person getPerson() {
		return new Person(9999,"kumar",getAddress() );
	}

}
