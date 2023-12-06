package Srikanth;

import java.util.*;

public class Maximun {

	
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int max =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
				
			}
		}
		System.out.println(max);

	}

}
