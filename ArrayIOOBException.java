package Exception_Handling;

public class ArrayIOOBException {

	public static void main(String[] args) {
	      
		
		int a[]=new int[3];	       
	       a[0]=1;
	       a[1]=2;
	       a[2]=3;
	       a[3]=4;
	      
	       System.out.println(a[3]);
	       System.out.println(a);       

	}

}
