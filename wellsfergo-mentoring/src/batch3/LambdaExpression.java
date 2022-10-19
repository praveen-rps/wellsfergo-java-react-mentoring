package batch3;


@FunctionalInterface
interface Mathematics{
		public int add(int a, int b);

}

@FunctionalInterface
interface inter1{
	public void display();
}

@FunctionalInterface
interface inter2 extends inter1{
	public void display();
}

@FunctionalInterface
interface inter3 extends inter1, inter2{
	
}



class Maths implements Mathematics{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}
class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the thread...");
		
	}
	
}


// (a,b)->a+b;
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Maths m = new Maths();
		Mathematics m = (a,b)->a+b;
		System.out.println(m.add(200,200));
		
		//MyThread t1 = new MyThread();
		
		Runnable t1 = ()->System.out.println("Inside the thread...");
		Thread t = new Thread(t1);
		t.start();

	}

}
