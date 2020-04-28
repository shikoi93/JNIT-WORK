class Iphone{
void price() {
System.out.println(" iPhones are expensive");
}
}
class IphonePro extends Iphone {
 void price() {
 System.out.println("Most people buy iPhone on plan");
 super.price();
}
 void storage() {
 System.out.println("iPhone storage starts from 32GB");
}
}
class SuperClass {
 public static void main(String[] args) {
  IphonePro p = new IphonePro();
  p.price();
  p.storage();
}
}
