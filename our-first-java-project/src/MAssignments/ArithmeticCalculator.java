package MAssignments;

import java.util.Scanner;

public class ArithmeticCalculator {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("choose your operation");
	String h=s.nextLine();
    System.out.println("enter first number");
	int a=s.nextInt();
	System.out.println("enter second number");
	int b1=s.nextInt();
	switch(h) {
	case "add":System.out.println(a+b1);
	break;
	case "subtraction":System.out.println(a-b1);
	break;
	case "divide":System.out.println(a/b1);
	break;
	case "multiplication":System.out.println(a*b1);
	break;
	default:System.out.println("doesn't exsist"); 
	}
}
}