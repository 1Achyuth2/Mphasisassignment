package MAssignments;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashM {
public static void main(String[] args) {
	HashMap m=new HashMap();
	m.put(34,"abhi");
	m.put(45,"achyuth");
	m.put(67,"UV");
	m.put(76,"shiva");
    System.out.println(m);
    System.out.println(m.get(34));
    System.out.println(m.keySet());
    System.out.println(m.values());
    System.out.println(m.containsKey(76));
    System.out.println(m.containsValue("shiva"));
    System.out.println(m);
    m.clear();
    System.out.println(m);
    
    
    
    Hashtable<Integer,String> h=new Hashtable<Integer,String>();  

    h.put(4,"achyuth");  
    h.put(5,"varma");  
    h.put(6,"camera");  
    h.put(7,"photography");  

    System.out.println("The elements of HashTable are ");  
     System.out.println(h.get(67));
     System.out.println(h.keySet());
     System.out.println(h.containsValue("assignment"));
     System.out.println(h.values());
     System.out.println(h.containsKey(76));
     System.out.println(h);



    TreeMap map=new TreeMap();    
    map.put(8,"never");    
    map.put(9,"give");    
    map.put(10,"up");       

    System.out.println("The elements of TreeMap are ");     
    System.out.println(map.get(3));
    System.out.println(map.containsValue("queue"));
    System.out.println(map.keySet());
    System.out.println(map.containsKey(76));
    System.out.println(map);
    System.out.println(map.values());

    }    

}
