package MAssignments;

import java.util.Vector;

public class CollectionVec {
	public static void main(String[] args) {
	    Vector vec = new Vector();
	    vec.addElement(15); 
	    vec.addElement(30); 
	    vec.addElement(67); 
	    vec.addElement(32); 
	    vec.addElement(98); 
	    System.out.println(vec.get(1));
	    System.out.println(vec.contains(67));
	    System.out.println(vec.size());
	    System.out.println(vec.set(5, 33));
	}
	
}
