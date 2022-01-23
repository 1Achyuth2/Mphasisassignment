package JavaAndDataStructures;

class A{
	int i=99;
	static double aa=66;
	void work() {
		System.out.println("it fine");
	}
	static void gun() {
		System.out.println("go forward");
	}
}
class C extends A{
	int h=54;
}
class B extends C{
	int j=88;
	void release() {
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(aa);
		A a=new A();
	    a.work();
	    gun();//it can be shared
}
}
public class Inheritance {
public static void main(String[] args) {
	B b=new B();
	b.release();
}
}
