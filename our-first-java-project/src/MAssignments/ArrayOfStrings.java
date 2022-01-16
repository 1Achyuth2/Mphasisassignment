package MAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfStrings {
public static void main(String[] args) {
	Scanner de=new Scanner(System.in);
	System.out.println("enter string values");
	ArrayList <String> a=new ArrayList<String>();
	String qw=de.nextLine();
	String f=de.nextLine();
	String j=de.nextLine();
	a.add(qw);
	a.add(f);
	a.add(j);
    System.out.println("enter any one string from above strings");
    String fe=de.nextLine();
    if(qw.contains(fe) || f.contains(fe) || j.contains(fe)) {
    	System.out.println(fe);
    	System.out.println("it is valid");
    }
    else {
    	System.out.println("invalid");
    }
}
}