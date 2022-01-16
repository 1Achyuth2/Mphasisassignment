package MAssignments;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayL{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(34);
		a.add(31);
		a.add(21);
	    Iterator g=a.iterator();
	    System.out.println(g.hasNext());
	    System.out.println(g.next());
	    System.out.println(g.hasNext());
	    System.out.println(g.next());
	    System.out.println(a.add(61));
	    a.set(2, 77);
	    System.out.println(a);
	    System.out.println(a.contains(100));
	    System.out.println(a.isEmpty());
	    System.out.println(a.size());
	}
}