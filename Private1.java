package Private;


public class Private1 {
	private int s=44;
public static void main(String[] args) {
	Private1 f=new Private1();
	System.out.println(f.s);
    Private2 d=new Private2();
    d.setMethod(45);
    d.setMethod1("achyuth");
    System.out.println(d.getMethod()+" , "+d.getMethod1());
}
}
class Private2{
        private int a;
        private  String b; 
        public  void setMethod(int a) {
        	this.a=a;
        }
        public void setMethod1(String b) {
        	this.b=b;
        }
        public int getMethod() {
        	return this.a;
        }
        public  String getMethod1() {
        	return this.b;
        }
	}
