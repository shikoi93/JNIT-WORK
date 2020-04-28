abstract class Dog {
void bark() {
	System.out.println("Every dog barks");
}
abstract void run();
abstract void price();
}
class Greyhound extends Dog {
  void run() {
	System.out.println("This dog runs 45 miles per hour.");
}
  void price() {
	System.out.println("Greyhounds are expensive");
}
}
class AmericanFox extends Dog {
   void run() {
	System.out.println("This dog runs 30-40 miles per hour");
}
  void price(){
	System.out.println("AmericanFox are the cheapest among dogs.");
}
}
public class OverRiding {
  public static void main(String args[]){
	Dog d;
	d = new Greyhound();
	d.bark();
	d.run();
	d.price();
	d = new AmericanFox();
	d.bark();
	d.run();
	d.price();
}
}
