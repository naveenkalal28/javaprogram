package Srikanth;

//A Method which is creates and returns the Object of another Class is Called Factory Method.

class Car
{
   int regno = 123;

   public void drive() {
      System.out.println("driving..");
   }
}
class CarFactory   //factory class
{ 
   public Car createCar()  //instance factory method
   {
      Car c = new Car();
      return c;
   }
}

public class FactoryMethod {

	public static void main(String[] args) {
		 CarFactory cf = new CarFactory(); 
	      Car c = cf.createCar();
	     // System.out.println(c);
	      System.out.println(c.regno);
	      c.drive();
	}

}

