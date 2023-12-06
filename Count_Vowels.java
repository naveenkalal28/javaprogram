package StringsNew;

public class Count_Vowels {

	public static void main(String[] args) {
		
		String str="prsnth";
		char[] ch=str.toCharArray();
		int count=0;
		boolean flag=false;
		for(int i=0; i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'|| ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
				flag=true;	
				System.out.println(ch[i]);
			}

		}
		if(flag==true) {
			System.out.println("vowels");
		}else {
			System.out.println("no vowels");
		}
		System.out.println("Count of Vowels in String : "+count);
		
	}

}
