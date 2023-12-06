package Practice;

class Employee
{
   int eno;
   String name;
   double salary;

   public Employee() 
   {
      eno = 1;
      name = "john";
      salary = 1000.0;
   }

   public Employee(int eno, String name, double salary) 
   {
      this.eno = eno;
      this.name = name;
      this.salary = salary;
   }

   public void show() {
      System.out.println(eno + " -- " + name + " -- " + salary);
   }
}

public class Constructor
{
   public static void main(String[] args)
   {
      Employee emp1 = new Employee(); 
      Employee emp2 = new Employee(2, "susan", 2000.0);

      emp1.show();
      emp2.show();
   }
}