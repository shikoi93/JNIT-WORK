import java.util.*;
class PQueueDemo{
public static void main(String args[]){
PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
ArrayDeque<Double> p=new ArrayDeque<Double>();
pq.add(1);
p.add(1.5);
pq.add(2);
p.add(2.5);
pq.add(3);
p.add(3.5);
pq.add(4);
p.add(4.5);
pq.add(5);
p.add(5.5);
pq.add(6);
p.add(6.5);
pq.add(7);
p.add(7.5);
pq.add(8);
p.add(8.5);
pq.add(9);
p.add(9.5);
pq.add(0);
p.add(0.5);
pq.add(11);
p.add(11.5);
System.out.println(pq);
System.out.println(p);
}
}