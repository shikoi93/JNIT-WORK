public class College {
 String student;
 int id;
 int grade;
 String major;
}
public class Faculty {
 int faculty_id;
 int age;
 float salary;
}
public class Dtest{
public static void main(String args[]){
College sr = new College();
System.out.println(sr.student);
System.out.println(sr.id);
System.out.println(sr.grade);
System.out.println(sr.major);
Faculty rj=new Faculty();
rj.faculty_id=1;
rj.age=27;
rj.salary=1200;
 System.out.println("faculty id="+rj.faculty);
System.out.println("faculty age="+rj.age);
System.out.println("faculty salary="+rj.salary);
}
}
