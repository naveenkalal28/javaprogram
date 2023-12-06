package Srikanth;

class Test extends Thread {

	public void run() {
		

		System.out.print(Thread.currentThread().getName());
		
		System.out.print(" -->> Hlo Baby...");
		System.out.println();
	}
}

class Test2 extends Thread {
	public void run() {
		System.out.print(Thread.currentThread().getName());
		System.out.println(" -->> Where r u..?");
		
		System.out.println(" 	 -->> Waiting for u...!");
	}
}

public class Mul_Type4 {

	public static void main(String[] args) {
		//Thread.currentThread().setName("Prasanth");
		System.out.print(Thread.currentThread().getName());
		Test t = new Test();
		t.start();
		System.out.println();
		
		
		
		System.out.println();

		System.out.println();
		Test2 t2 = new Test2();
		t2.start();

	}

}
