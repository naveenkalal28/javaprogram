package Srikanth;


class Father {
	void house() {
		System.out.println("2BHK HOUSE...");
	}
	void land() {
		System.out.println("10AC LAND...");
		
	}
}
class Son extends Father{
	
	void study() {
		System.out.println("Bachelor of Technology....");
	}
	void vehicle() {
		System.out.println("Honda Shine....");
	}
	
}

public class SingleLevel_Inheritence {

	public static void main(String[] args) {

     Son s=new Son();
     s.study();
     s.vehicle();
     s.house();
     s.land();

	}

}
