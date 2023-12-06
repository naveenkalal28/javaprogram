package Practice;

class Students
{
	   int id = 1;

	   public void study() 
	   {
	      System.out.println("studying..");
	   }
}

public class ForEx {

	public static void main(String[] args) throws Exception
	{

		Class c = Class.forName("Students");
		Object o = c.newInstance();
		Students s = (Students)o;
		System.out.println(s);
		System.out.println(s.id);
		s.study();

	}
}
