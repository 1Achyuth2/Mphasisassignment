package JavaAndDataStructures;

public class ThreadingConcepts  {
public static void main(String[] args) {
	MyThread t1=new MyThread();
	t1.start();
	try {
		t1.sleep(1000);
	} catch (InterruptedException e) {
		System.out.println("carry on");
	}
}
}

class MyThread extends Thread{ 
public void run() {
	Test ot=new Test();
	ot.test();
	synchronized (this) {
		try {
			wait(6000);
			Run y=new Run();
			y.start();
			System.out.println("fine");
			wait(5000,3000);
			Goal g=new Goal();
			g.start();
		} catch (InterruptedException e) {
			System.out.println("ok");
		}
		notify();
		System.out.println("come fast");
		notifyAll();
		System.out.println("enter");
	}
}
}
class Run extends Thread{
    public void run() {
    	Test r=new Test();
    	r.test1();
    }
}
class Goal extends Thread{
	public void run() {
		Test f=new Test();
		f.test2();
	}
}
class Test{
	public void test() {
		System.out.println("hello");
	}
	public void test1() {
	System.out.println("hi");
}
	public void test2() {
		System.out.println("lets go");
	}
}