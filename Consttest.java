public class Main {
 //public static void main(String args[]){
	String doctor;
	int age;
	float salary;
public Main(String doctor, int age, float salary) {
	this.doctor=doctor;
	this.age=age;
	this.salary=salary;
}
public void show() {
 System.out.println("The name of the doctor is " +doctor);
 System.out.println("The age of the doctor is " +age);
 System.out.println("The salary of the doctor is " +salary);
 
}
Main show (Main s) {
    s.doctor = "shiva";
    s.age = 27;
    s.salary = 10000;
    return s;
}
public static void main(String Args[]){
   Main s = new Main("ABRAM", 28, 11000);
    s.show();
}

}





