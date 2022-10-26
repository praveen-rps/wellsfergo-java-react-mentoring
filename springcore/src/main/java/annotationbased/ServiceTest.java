package annotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceTest {

	@Autowired
	//@Qualifier("permanent")
	EmployeeService service;

	public String showServiceType() {
		return service.getEmployeeType();
	}
}
