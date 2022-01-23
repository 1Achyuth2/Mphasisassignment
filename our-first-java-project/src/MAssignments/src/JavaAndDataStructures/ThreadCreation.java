package JavaAndDataStructures;

public class ThreadCreation extends Thread{
public static void main(String[] args) {
	ThreadCreation t=new ThreadCreation();
	t.start();
	Release r=new Release();
	r.run();
	System.out.println(Thread.currentThread().getName());
}
public void run() {
	System.out.println("hello world");
	System.out.println(Thread.currentThread().getName());
}
}
class Release implements  Runnable {
	public void run() {
		System.out.println("ok then");
	}
}