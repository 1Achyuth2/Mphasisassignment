package MAssignments;

import java.util.Scanner;

public class SetOfString {
public static void main(String[] args) {
	Scanner f=new Scanner(System.in);
	String x=f.nextLine();
	System.out.println("enter word present in the above string");
	System.out.println(x.contains(f.nextLine()));
}
}