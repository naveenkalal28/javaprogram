package Arrays;

public class Sum_Of_OddNumber_in_Array {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 10 };

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==1)
			
				sum += a[i];
		}

		System.out.println("Sum of Elements : " + sum);
	}

}
