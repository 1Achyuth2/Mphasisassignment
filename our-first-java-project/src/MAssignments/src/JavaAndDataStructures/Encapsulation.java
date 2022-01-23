package JavaAndDataStructures;

public class Encapsulation {
public static void main(String[] args) {
	Bean e=new Bean();
	e.setName("achyuth");
	e.setId(3);
	e.setHeight(5.9);
    Bean []g=new Bean[3];
    g[0]=e;
    g[1]=e;
    g[2]=e;
    for(Bean value:g) {
    	System.out.println("name -->"+value.getName()+" ID -->"+value.getHeight()+"Height -->"+value.getHeight());
    }
}
}
class Bean{
private int a;
private double b;
private String c;
void setId(int a) {
	this.a=a;
}
void setHeight(double b) {
	this.b=b;
}
void setName(String c) {
	this.c=c;
}
int getId() {
	return a;
}
double getHeight() {
	return b;
}
String getName() {
	return c;
}
}