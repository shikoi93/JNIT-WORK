import java.util.*;
class ListD{
public static void main(String args[]){
ArrayList<Integer> h=new ArrayList<Integer>();
h.add(1);
h.add(2);
h.add(3);
h.add(4);
h.add(5);
h.add(6);
h.add(7);
h.add(8);
System.out.println(h);
ListIterator li=h.listIterator();
while(li.hasNext()){
System.out.println(li.next());
}
System.out.println("===================");
while(li.hasPrevious()){
System.out.println(li.previous());
}
}
}