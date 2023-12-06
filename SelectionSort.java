package Srikanth;

public class SelectionSort {

	public static void main(String[] args) {

		int[] a = { 56,126,4,116, 26, 76, 45, 49, 16  };

		int min, temp;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min])
					min = j;

			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		System.out.println("After Selection Sort...");
		for (int b : a) {
			System.out.print(b + " ");
		}
	}

}
