package Arrays;

public class Inceasing_Decreasing {

	public static void main(String[] args) {

		int a[] = { 1, 97, 55, 7, 8, 54, 67, 44, 89, 3, 4, 6 };
	for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
				int	temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Values in Accending Order : ");
		System.out.println("===========================");
		// System.out.println("Values in Decending Order : ");
		// System.out.println("===========================");

		for (int b : a) {

			System.out.print(b+" ");
		}
		System.out.println("Second Highest Value " + a[a.length - 2]);

	}

}
