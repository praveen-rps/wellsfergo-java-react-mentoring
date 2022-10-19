package batch2;
interface Maths{
	public int add(int a, int b);
}


/*
class Mathematics implements Maths{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
}


class MyThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println("INSIDE CHILD THREAD..");
	}
}

*/
public interface LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Mathematics m = new Mathematics();
		
		Maths m1 = (a,b)->a+b;
		System.out.println(m1.add(10,20));
		
		
		//MyThread t = new MyThread();
		
		Runnable t = ()->System.out.println("INSIDE CHILD THREAD..");;
		
		Thread m2 = new Thread(t);
		m2.start();
		

	}

}
