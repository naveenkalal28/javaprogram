package Arrays;

public class Common_Array {

	public static void main(String[] args) {

		int a[] = { 1, 17, 2, 15, 26, 3, 4, 9, 5, 6 };
		int b[] = { 7, 8, 9, 0, 15, 3, 4 };
		int sum = 0;
        System.out.println("Common Elements Found in the indexes of ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {

					System.out.println("a[" + i + "] =" + a[i]);
					sum += a[i];
				}
			}
		}

		System.out.println("Sum of Common Elements : " + sum);

	}

}
 