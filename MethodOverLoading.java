package Srikanth;

class Prabhas {

	void salaar() {

		System.out.println("Most Violent MAN Called One MAN");

	}

	void salaar(int a) {
		System.out.println("Budget of Movie : " + a);
		System.out.println();
	}

}

class Nani {

	Nani() {
		System.out.println("Natural Star...");
	}

	Nani(String s) {
		System.out.println(s);
		System.out.println();
	}

}

class Bujjigadu {

	int Bujji = 10, Gadu = 20;

}

public class MethodOverLoading {

	public static void main(String[] args) {

		Prabhas p = new Prabhas();
		p.salaar();
		p.salaar(500000000);

		Nani n = new Nani();
		Nani n2 = new Nani("Handsome_Hero");

		Bujjigadu b = new Bujjigadu();

		System.out.println("RESULT : " + b.Bujji + b.Gadu);

	}

}
