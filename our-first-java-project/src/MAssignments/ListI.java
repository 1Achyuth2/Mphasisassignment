package MAssignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListI {
public static void main(String[] args) {
	ArrayList l=new ArrayList();
	l.add('c');
	l.add(true);
	l.add("achyuth");
	l.add(100);
	l.add(3.4);
	ListIterator z=l.listIterator();
	System.out.println(z);//beacause before c element location
	System.out.println(z.hasNext());
	System.out.println(z.next());
	System.out.println(z.hasNext());
	System.out.println(z.hasPrevious());
	System.out.println(z.previous());
	l.set(2,"sri");
	l.remove(3.4);
	System.out.println(l);
	System.out.println(l);
	System.out.println(l.contains(100));
	System.out.println(l.isEmpty());
}
}
