package Srikanth;

public class BubbleSortEx {

	public static void main(String[] args) {
		
		int [] a= {63,45,3,76,986,446,35,65,99};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int b:a) {
			System.out.print(b+" ");
	
		}
		System.out.println();
		System.out.println("Highest Number : "+a[a.length-1]);
		System.out.println("Second Highest Number : "+a[a.length-2]);
		System.out.println("Third Highest Number : "+a[a.length-3]);
		
		System.out.println("Lowest Number : "+a[0]);
		System.out.println("Second Lowest Number : "+a[1]);
		
		
		
		
	}

}
