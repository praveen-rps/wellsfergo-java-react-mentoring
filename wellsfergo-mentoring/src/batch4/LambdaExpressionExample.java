package batch4;


@FunctionalInterface
interface Maths{
	public int add(int a, int b);
}


class Mathematics implements Maths{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mathematics m = new Mathematics();
		
		Maths m = (a,b) ->	a+b;
		
		System.out.println(m.add(200, 100));

	}

}
