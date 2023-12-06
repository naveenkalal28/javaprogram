package Practice;

class Ex {
		int id = 1;
		String name = "ravi";

		public void work() {
			System.out.println("working..");
		}
	
}

public class FornameEx {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
	{
		Class c = Class.forName("Ex");
		Object o = c.newInstance();
		Ex e = (Ex) o;
		System.out.println(e);
		System.out.println(e.id + " --- " + e.name);
		e.work();

	}
}
