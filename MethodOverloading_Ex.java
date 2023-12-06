package Srikanth;


class Prasanth
{
	public void add() {
		System.out.println("Hlo...");
	}
    public void add(String name) {
    	System.out.println("My name is..."+name);
    }
    public void add(int age) {
		System.out.println("My age is..."+age);
	}
    
}

public class MethodOverloading_Ex {

	public static void main(String[] args) {
		Prasanth p=new Prasanth();
		p.add();
		p.add("Prasanth");
		p.add(22);
		
	}

}
