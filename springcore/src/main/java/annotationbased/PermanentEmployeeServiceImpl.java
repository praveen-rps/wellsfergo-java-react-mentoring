package annotationbased;

import org.springframework.stereotype.Component;

@Component
public class PermanentEmployeeServiceImpl implements EmployeeService{

	@Override
	public String getEmployeeType() {
		// TODO Auto-generated method stub
		return "Employee is permanent";
	}
}
