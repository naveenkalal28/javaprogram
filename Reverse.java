package Arrays;

public class Reverse {
	
//	static void reverse(int a[]) {
//		
//		int i=0, j=a.length-1;
//		while(i<=j) {
//			int temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//			i++;
//			j--;
//		}
//	}
	

	public static void main(String[] args) {
		int arr[]= {2,4,65,7,24,50,79};
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		reverse(arr);
//		System.out.println();
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
