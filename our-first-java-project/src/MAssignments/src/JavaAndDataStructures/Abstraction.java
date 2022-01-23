package JavaAndDataStructures;

interface ChickenBiryani{
	void prepare();
}
class Rice implements ChickenBiryani{
	public void prepare() {
		System.out.println("preparation completed");
	}
}
class Helper {
     ChickenBiryani help() {
		ChickenBiryani c=new Rice();
		return c;
	}
}
public class Abstraction {
public static void main(String[] args) {
	Helper h=new Helper();
	ChickenBiryani chicken=h.help();
	chicken.prepare();
}
}
