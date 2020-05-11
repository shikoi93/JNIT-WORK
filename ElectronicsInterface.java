interface Electronics {
void cost();
void storage();
}
abstract class Mobile implements Electronics{
void screen() {
System.out.println("Every mobile have screen.");
}
}
abstract class Laptop implements Electronics {
void size() {
System.out.println("Every laptops are bigger than cellphone.");
}
}

class Iphone extends Mobile {
public void cost() {
System.out.println("iPhones are expensive brand.");
}
public void storage() {
System.out.println("iPhone has storage of 32GB to 512GB.");
}
}
class Samsung extends Mobile{
public void cost() {
System.out.println("Samsung is as expensive as Iphone.");
}
public void storage() {
System.out.println("Samsung also has the memory of 32GB tO 512 but memory can be extended through external SD card.");
}
}
class MacOS extends Laptop{
public void size() {
System.out.println("MacOS has the highest size of 16 inch.");
}
public void storage() {
System.out.println("MacOs storage ranges from 128GB to 512GB.");
}
public void cost() {
System.out.println("MacOs costs up $2,399.");
}
}
class Lenovo extends Laptop{
public void size() {
System.out.println("Lenevo has the highest size of 15.4 inches.");
}
public void storage() {
System.out.println("Lenevo storage ranges from 128GB TO 1TB.");
}
public void cost() {
System.out.println("Lenevo cost ranges from $250 to $1000.");
}
}
class ElectronicsInterface {
public static void main(String args[]){
Laptop x=new MacOS();
x.cost();
x.size();
x.storage();
x=new Lenovo();
x.cost();
x.size();
x.storage();
Mobile m=new Iphone();
m.cost();
m.screen();
m.storage();
m=new Samsung();
m.cost();
m.screen();
m.storage();
}

}

