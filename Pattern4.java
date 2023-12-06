package Srikanth;

public class Pattern4 {

	public static void main(String[] args) {
		
		int num=5;
		for(int i=num; i>=1; i--)
		{
			for(int j=num-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
