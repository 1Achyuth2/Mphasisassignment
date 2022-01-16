package MAssignments;

import java.util.PriorityQueue;

import java.util.Iterator;

public class PriorityQ {
public static void main(String[] args) {
	PriorityQueue q=new PriorityQueue();
	q.add(45); 
	q.add(3);
	q.add(67);
	q.add(91);
	q.add(56);
	Iterator t=q.iterator();
    System.out.println(t.hasNext());
    System.out.println(t.next());
    System.out.println(t.hasNext());
    System.out.println(t.next());
    System.out.println(q.poll());//it prints best element
    System.out.println(q);//it prints elements except best element
    System.out.println(q.peek());//it prints best element
    System.out.println(q);//it prints elements including best element
    System.out.println(q.contains(67));
    System.out.println(q.remove(91));
    System.out.println(q.size());
    q.clear();
    System.out.println(q.peek());
    System.out.println(q.poll());
    System.out.println(q);
    
}
}
