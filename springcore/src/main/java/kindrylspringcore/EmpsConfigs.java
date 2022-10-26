package kindrylspringcore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class EmpsConfigs {
	
	@Configuration
	@ComponentScan(basePackages="kindrylspringcore")
	public class AnnotationConfig {

	}


}
