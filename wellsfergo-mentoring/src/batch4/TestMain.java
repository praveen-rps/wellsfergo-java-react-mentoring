package batch4;
interface Test{
	public static void test() {
		System.out.println("Insie the static method of test");
	}
	
	public default void display() {
		System.out.println("Inside the default of interface");
	}
}
class MyTest implements Test{
	
}
public interface TestMain {
	
	public static void main(String args[]) {
		System.out.println("Hello world...");
		MyTest m = new MyTest();
		m.display();
		Test.test();
		
	}

}
