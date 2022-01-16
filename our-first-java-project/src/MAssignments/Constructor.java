package MAssignments;


public class Constructor {
	String a;
	int b;
	double c;
	char d;
public static void main(String[] args) {
	Constructor c= new Constructor("achyuth",14, 4.4,'t', "lets do this", 45, 3.5, 'r');
	c.method();
	Constructor f= new Constructor("sri", 45,6.7);
	f.method();
	Constructor g= new Constructor("mphasis",6);
	g.method();
	Constructor h= new Constructor("achyuth");
	h.method();
	A ca=new A();
	ca.display();
}
public Constructor(String a,int b,double c,char d,String lotus,int benz,double bmw,char audi) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;
	a=lotus;
	b=benz;
	c=bmw;
	d=audi;
}
private Constructor(String a,int b,double ok) {
	this.a=a;
	this.b=b;
	c=ok;
}
protected Constructor(String a,int se) {
	this.a=a;
	b=se;
}
 Constructor(String a) {
	this.a=a;
}
void method() {
	System.out.println("------------------public constructor ----------------------");
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(this.c);
	System.out.println(this.d);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println("--------------------private constructor---------------------");
	System.out.println(this.a);
	System.out.println(this.b);
	System.out.println(c);
	System.out.println("---------------------protected constructor-------------------");
	System.out.println(this.a);
	System.out.println(b);
	System.out.println("---------------------package private------------------------");
	System.out.println(this.a);
}	
}
class A{
String he;

void display() {
	System.out.println(he);
}
}
