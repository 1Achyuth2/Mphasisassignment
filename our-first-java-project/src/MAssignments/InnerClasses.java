package MAssignments;

public class InnerClasses {
public static void main(String[] args) {
	new New().method1();
	New.Old ref=new New().new Old();
	ref.method();
	New n=new New();
	n.method1();
	new Gave().ok();
	Good h=new Good() {
		@Override
		public void work() {
			System.out.println("ok fine");
		}
	};
	h.work();
	Refer t=new Refer();
	t.get(new Release() {
		@Override
		public void work() {
			System.out.println("it working");
		}
	});
}
}
class New{
	int a=45;
	class Old{
		int a=54;
		void method() {
			int a=99;
			System.out.println("---------------regular inner class-------------");
			System.out.println("hello");
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(New.this.a);
		}
	}
	void method1() {
	new Old().method();
	}
}
class Gave{
	final int a=88;//final
	int v=45;//effectivily final
	void ok(){
		class Give{
			final int d=54;
			int k=67;
			void method1() {
				System.out.println("-----------------method local inner class--------");
				System.out.println("hi");
				System.out.println(d);
				System.out.println(k);
				System.out.println(v);
				System.out.println(a);

			}
		}
		new Give().method1();
		System.out.println("----------------annonymous class------------------");
	}
}
interface Good{
	void work(); 
}


interface Release{
	void work();
}
class Refer {
	public void get(Release r) {
		System.out.println("------------argument annonymous class---------------");
		r.work();
	}
}
