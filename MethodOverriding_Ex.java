package Srikanth;

class Pandu {
	public void Name(String name) {
		System.out.println("My name is...." + name);
	}

	public void Crush(String name) {
		System.out.println("My crush Name is...." + name);
	}

}
class Nanigaru extends Pandu
{
	public void Name(String name) {
		System.out.println("Hiii... "+name);
	}
	public void Crush(String name) {
		System.out.println("Chrushhhuuuu...." + name);
	}
}
public class MethodOverriding_Ex {

	public static void main(String[] args) {
		Nanigaru n=new Nanigaru();
		n.Name("Prasanth");
		n.Crush("Smrithi");
		n.Name("Kanna");

	}

}
