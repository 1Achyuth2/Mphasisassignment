package MAssignments;

import java.util.Scanner;

public class Str {
public static void main(String[] args) {
	String s=new String("achyuth");
	System.out.println(s);
	String a="achyuth";
	System.out.println(a);
	String b=" varma";
	a+=b;
	System.out.println(a);
	a=s.concat(" lets do this");
	System.out.println(a);
	System.out.println(a.toUpperCase());
	System.out.println(a.charAt(5));
	System.out.println(a.substring(11));
	System.out.println(a.substring(5, 11));
	Scanner g=new Scanner(System.in);
	System.out.println("lets do great");
	String j=g.nextLine();// it will move to the next line
	System.out.println("ok we will ");
	String f=g.next();//it wont move to the next line
}
}
