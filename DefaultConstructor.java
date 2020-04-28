DefaultConstructor
public class Vehicle{
 int year = 2018;
 String make = "TOYOTA";

Vehicle () {
System.out.println("This is a Car.");
   }
}
public class DConstructor{
	public static void main(String args[]){
             Vehicle c = new Vehicle();
	     System.out.println(c.year);
	     System.out.println(c.make);
}
}