package MAssignments;
public class ReturnTypes{
	public static void main(String[] args) {
		ReturnTypes r=new ReturnTypes();
		System.out.println(r.method(4, 6));
		System.out.println(r.method1(55.6, 7.8));
		System.out.println(r.method2('u'));
		System.out.println(r.method3(4));

	}
	int method(int a,int f) {
		return a+f;
	}
	double method1(double b,double g) {
		return b+g;
	}
	char method2(char c) {
		return c;
	}
	boolean method3(int u) {
		if(u>0) {
			return true;
		}
		else {
			return false;
		}
	}
	float method4(int f) {
		return f;
	}
}