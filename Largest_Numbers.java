
package Arrays;

public class Largest_Numbers {

	public static void main(String[] args) {

		int arr[] = {300,250,340,500,50,170,80,100,90,150 };

		int largest =Integer.MIN_VALUE;
		int Second_Large = Integer.MIN_VALUE;
		int Third_Value=Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				
                Third_Value=Second_Large;
				Second_Large = largest;
				largest = arr[i];

			} else if (arr[i] > Second_Large ) {
				Third_Value=Second_Large;
				Second_Large = arr[i];
			}
			else if(arr[i]>Third_Value ){
				
			   Third_Value=arr[i];
			}
		}
		System.out.println("Largest Number : " + largest);
		System.out.println("Second Largest Number : " + Second_Large);
		System.out.println("Third Largest Number : " + Third_Value);

	}

}
