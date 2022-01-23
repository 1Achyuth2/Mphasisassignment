package JavaAndDataStructures;

public class RunTimePolymorphism {
public static void main(String[] args) {
	Gun r=new Fun();
	r.work();
	r.hard();
	r.easy();
	Retain r1=new Combine();
	r1.gun();
	r1.come();
	if(r instanceof Gun) {
	Fun f=(Fun)r;
	f.phone();
	}
	if(r1 instanceof Retain) {
		Combine c=(Combine)r1;
		c.life();
	}
}
}
interface Gun{
	void work();
	void hard();
	default void easy() {
		System.out.println("completed");
	}
}
interface Retain{
	void gun();
	default void come(){
		System.out.println("come fast to home");
	}
}
class Fun implements Gun{
	public void work() {
		System.out.println("work completed");
	}
	public void hard() {
		System.out.println("hard word bringd u up");
	}
	void phone() {
		System.out.println("it workss normally");
	}
}
class Combine implements Retain{
	public void gun() {
		System.out.println("shoot him");
	}
	void life() {
		System.out.println("u should take serious");
	}
}