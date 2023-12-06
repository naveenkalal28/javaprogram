package Arrays;

public class Duplicate_Element {

	public static void main(String[] args) {
	
		 int a[]= {1,2,3,4,5,6};
		
	//String a[]= {"JAVA","PYTHON","JAVA","DOTNET","PYTHON"};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Element Found : "+a[i]);
					flag=true;
				
					
				}
			}
		}
		if(flag==false)
			System.out.println("Duplicate Element is Not Found ");

	}

}
