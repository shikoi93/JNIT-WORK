public class Parameterized {
String name;
int year;

Parameterized(String n, int y){
name = n;
year = y;
}
void display() {
System.out.println(name+ "" +year);
}
public static void main(String args[]) {
Parameterized O = new Parameterized("Reference " , 1993);
O.display();
}
}