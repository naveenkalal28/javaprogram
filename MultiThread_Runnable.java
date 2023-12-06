package Srikanth;

public class MultiThread_Runnable implements Runnable{
	
	public void run() {
		System.out.println("NANI GARU....");
	}

	public static void main(String[] args) {
		MultiThread_Runnable m=new MultiThread_Runnable();
		Thread th=new Thread (m);
		th.start();
		

	}

}
