package annotationbased;

public class HelloWorld {
	String greet;
	String stream;
	public HelloWorld() {
		
	}
	
	public HelloWorld(String greet, String stream) {
		super();
		this.greet = greet;
		this.stream = stream;
	}

	public String getGreet() {
		return greet;
	}
	public void setGreet(String greet) {
		this.greet = greet;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getMessage1() {
		// TODO Auto-generated method stub
		return "Stream:"+stream;
	}

	public String getMessage2() {
		// TODO Auto-generated method stub
		return "Greeting:"+greet;
	}
	

}
