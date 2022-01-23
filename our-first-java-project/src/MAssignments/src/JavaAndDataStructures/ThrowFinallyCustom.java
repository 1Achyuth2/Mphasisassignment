package JavaAndDataStructures;

public class ThrowFinallyCustom {
public static void main(String[] args) {
	try {
		System.out.println(5/0);
	} catch (Exception e) {
		System.out.println("division by zero is not possible");
	}
	System.out.println("hii");
	try {
		System.out.println(5/2);
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("end of program");
	}
	System.out.println("hello");
}
}
