package Srikanth;

public class BubbleSort {

	public static void main(String[] args) {

		int[] a = { 56,224, 126, 4, 116, 2,26, 76, 45, 49, 16 };
		int temp = 0;
		
        
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After Bubble Sort....");

		for (int b : a)

			System.out.println(b + " ");
	
		System.out.println("Highest Number - "+a[a.length-1]);

	}

}
