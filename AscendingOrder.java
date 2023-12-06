package Srikanth;

public class AscendingOrder {

	public static void main(String[] args) {

		String[] a = { "prasanth","pravallika","Prasanth", "Bhargavi", "Radhika", "Sai Pallavi", "Alpha" };

		String temp = null;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i].compareTo(a[j]) > 0) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (String b : a)
			System.out.println(b);

	}

}
