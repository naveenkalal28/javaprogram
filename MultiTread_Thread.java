package Srikanth;

public class MultiTread_Thread extends Thread {
	public void run() {
		System.out.println("Prasanth Kumar...");
	}

	public static void main(String[] args) {

		MultiTread_Thread m=new MultiTread_Thread();
		
		m.start();

	}

}
