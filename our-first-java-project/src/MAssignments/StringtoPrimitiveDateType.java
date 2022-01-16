package MAssignments;

import java.util.Scanner;

public class StringtoPrimitiveDateType {
	public static void main(String[] args) {
		Scanner ref=new Scanner(System.in);
		System.out.println("enter integer value");//all 8 primitive datatypes have a wrapper classes it is present in java.lang package
		String gr=ref.nextLine();
		String d=gr;
		try {
			int a=Integer.parseInt(d);
			System.out.println(a);
		}
		catch(Exception f){
			System.out.println("it is not valid");
		}
		
		
		System.out.println("enter float value");
		String wq=ref.nextLine();
		String h=wq;
		try {
			float s=Float.parseFloat(h);
			System.out.println(s);
		} catch (Exception e) {
			System.out.println("it is not valid");
		}
		
		
	System.out.println("enter boolean value");
	String lv=ref.nextLine();
	try {
	boolean se=Boolean.parseBoolean(lv);
	System.out.println(se);
	}
	catch(Exception se) {
		System.out.println("invalid");
	}
	
	
	System.out.println("enter character value");
	String wel=ref.nextLine();
	try {
		char c=wel.charAt(0);
		System.out.println(c);
	} catch (Exception e) {
		System.out.println("invalid");
	}
	
	
	System.out.println("enter byte vaue");
	String get=ref.nextLine();
     try {
		byte fw=Byte.parseByte(get);
		System.out.println(fw);
	} catch (Exception e) {
		System.out.println("invalid");
	}
     
     
     System.out.println("enter long value");
     String ro=ref.nextLine();
     try {
		long sw=Long.parseLong(ro);
		System.out.println(sw);
	} catch (Exception e) {
		System.out.println("invalid");
	}
     
     
    System.out.println("enter double value");
    String sw=ref.nextLine();
    try {
		double zw=Double.parseDouble(sw);
		System.out.println(zw);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("invalid");
	}
    
    System.out.println("enter short value");
    String let=ref.nextLine();
    try {
		short ok=Short.parseShort(let);
		System.out.println(ok);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("invalid");
	}
}
}
