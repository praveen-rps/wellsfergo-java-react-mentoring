package batch1;


@FunctionalInterface
interface Maths{
		public int add(int a, int b);
		
}

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mathsclass m = new Mathsclass();
		
		Maths m =(a,b)->a+b;
		System.out.println(m.add(100,200));

	}

}
