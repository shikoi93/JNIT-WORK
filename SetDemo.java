import java.util.*;
public class SetDemo {
	public static void main(String args[]){
        TreeSet<String> sk=new TreeSet<String>();
	System.out.println(sk.isEmpty());
        sk.add("J");
	sk.add("N");
	sk.add("I");
	sk.add("T");
	sk.add("C");
	sk.add("O");
	sk.add("M");
	sk.add("P");
	sk.add("A");
	sk.add("N");
	sk.add("Y");
	System.out.println("first() returns first alphabet element from the above input: " + sk.first());
	System.out.println("last() returns last alphabet element from the above input: " +   sk.last());
		System.out.println("pollFirst() removes the first alphabet from the above input: " + sk.pollFirst());
	System.out.println("pollLast() removes the last alphabet from the above input: " + sk.pollLast());
	System.out.println(sk);
	System.out.println(sk.isEmpty());
	System.out.println(sk.size());
	System.out.println(sk.contains("P"));
	System.out.println(sk.lower("A"));
	System.out.println(sk.floor("Y"));
	System.out.println(sk.ceiling("I"));
	System.out.println(sk.higher("A"));
	System.out.println(sk);


}
}
