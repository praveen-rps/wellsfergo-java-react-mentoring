package annotationbased;

import java.util.HashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;


@Component("dbs")
public class DbConnnect {
	
	HashMap<String,String> map;
	
	public DbConnnect() {
		map = new HashMap<>();
	}
	
	@PostConstruct
	public void setConnectionProperties() {
		map.put("driver", "com.jdbc.cj.Driver");
		map.put("url", "localhost:3306/kindryl");
		map.put("username", "root");
		map.put("password", "root");
	}
	
	@PreDestroy
	public void resetConnectionProperties() {
		map.clear();
		System.out.println("Inside the PreDestroy" +map);
	}
	
	public void displayConnectionDetails() {
		System.out.println(map);
	}

}
