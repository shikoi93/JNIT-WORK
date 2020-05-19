import java.util.*;
class MapDemo{
public static void main(String args[]){
HashMap<Integer,String> hm=new HashMap<Integer, String>();
hm.put(1,"S");
hm.put(2,"H");
hm.put(3,"I");
hm.put(4,"V");
hm.put(5,"A");
System.out.println(hm);
System.out.println(hm.containsKey(1)); // to check whether the given integer is present of not.this statement prints out "true" coz 1 is present.
System.out.println(hm.containsKey(9)); // this statement prints out false coz 9 is not present.
System.out.println(hm.containsValue("h"));
System.out.println(hm.get(5));
}
}
















