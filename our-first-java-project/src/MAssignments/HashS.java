package MAssignments;

import java.util.HashSet;
import java.util.Iterator;

public class HashS {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(45);
	h.add('t');
	h.add(34);
	h.add(71);
	h.add(5);
	Iterator d=h.iterator();
	System.out.println(d.hasNext());
	System.out.println(d.next());
	System.out.println(d.hasNext());
	System.out.println(d.next());
	System.out.println(h.contains(45));
	System.out.println(h.containsAll(h));
	System.out.println(h);
}
}
