package Practice;

public class Pattern {

	public static void main(String[] args) {
		int rows = 5, n = 1;

		for(int i=1;i<=rows;i++)
		{
		   for(int j=rows-1;j>=i;j--) {
		      System.out.print(" ");
		   }

		   for(int k=1;k<=n;k++) {
		      System.out.print("*");
		   }

		   n = n + 2;
		   System.out.println();
		}
	}

}
