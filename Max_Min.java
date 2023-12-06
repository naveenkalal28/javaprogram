package Arrays;

public class Max_Min {

	public static void main(String[] args) {

		int a[] = { 17, 2, 3, 44, 55, 6,9, 977, 8787, 9 };

		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum Value : " + min);

	}

}
