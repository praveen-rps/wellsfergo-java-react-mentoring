package batch4;

class MyThread extends Thread{
	public void run() {
		
		System.out.println("inside the thread..");
	}
}


public interface ThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		t.start();
		
		Runnable r = ()->{
			for(int i=0;i<100;i++)
				System.out.println(i);
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		for(int i=101;i<200;i++)
			System.out.println(i);

	}

}
