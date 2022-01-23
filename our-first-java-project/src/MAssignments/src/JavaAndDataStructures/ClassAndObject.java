package JavaAndDataStructures;

public class ClassAndObject {
	int r;
	void main() {
		double pi=3.14;
		double area=pi*r*r;
		System.out.println(area);
	}
public static void main(String[] args) {
	ClassAndObject c=new ClassAndObject();
	ClassAndObject f=new ClassAndObject();
	ClassAndObject g=new ClassAndObject();
	ClassAndObject c1=new ClassAndObject();
	c.r=5;
    c.main();
	f.r=9;
	f.main();
	g.r=2;
	g.main();
	c1.r=4;
	c1.main();
}
}
