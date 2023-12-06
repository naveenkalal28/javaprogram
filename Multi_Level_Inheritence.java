package Srikanth;

class Tenth{
	
	void school() {
		System.out.println("ZPSS HIGH SCHOOL...");
	}
	void marks() {
		System.out.println("10TH MARKS : 77% ");
		System.out.println();
	}	
	
}
class Intermediate extends Tenth{
	
	void intercollege() {
		System.out.println("Govt. Junior College...");
	}
	void interMarks() {
		System.out.println("Inter Marks : 83% ");
		System.out.println();
		
	}
}
class B_tech extends Intermediate{
	
	void B_techCollege() {
		System.out.println("MIST...");
	}
	void B_techMarks() {
		System.out.println("B.tech Marks : 66% ");
	}
}

public class Multi_Level_Inheritence {

	public static void main(String[] args) {
    
		B_tech b=new B_tech();
		b.school();
		b.marks();
		b.intercollege();
		b.interMarks();
		b.B_techCollege();
		b.B_techMarks();
    

	}

}
