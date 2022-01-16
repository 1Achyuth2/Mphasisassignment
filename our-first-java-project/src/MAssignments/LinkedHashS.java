package MAssignments;

import java.util.*;

public class LinkedHashS {
	public static void main(String[] args) {
	    System.out.println("LinkedHashSet");
	    LinkedHashSet s=new LinkedHashSet();  
	    s.add(11);  
	    s.add(13);  
	    s.add(12);
	    s.add(14);	
	    Iterator d=s.iterator();
	    System.out.println(s);
	    System.out.println(d.hasNext());
		System.out.println(d.next());
		System.out.println(d.hasNext());
		System.out.println(d.next());
		System.out.println(s.contains(45));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.remove(14));
		System.out.println(s);
	}
}
