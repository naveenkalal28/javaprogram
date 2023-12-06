package Arrays;

public class Minimun_Maximum {

	public static void main(String[] args) {
		int a[]= {6,4,3,2,8,9,13,10,50};
		int max=a[0];
		int min=a[0];
		int temp=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]> max) {
				temp=max;
				max=a[i];
				a[i]=temp;	
			}
			else if(a[i]<min){
				temp=min;
				min=a[i];
				a[i]=min;
				
			}
		}
		System.out.println("Maximum Number :"+max);
		System.out.println("Minimum Number :"+min);
	}

}
