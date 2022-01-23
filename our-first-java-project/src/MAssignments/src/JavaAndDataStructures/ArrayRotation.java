package JavaAndDataStructures;
import java.util.Scanner;
public class ArrayRotation{
	public static void main(String[] args) {
		int []a=new int[] {4,6,9,11,46};
        int []finalArray=new int[a.length];
        System.out.println("enter no.of rotations");
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int h=n;
		int t=0;
		while(h<a.length) {
			finalArray[t]=a[h];
			t++;
			h++;
		}
		h=0;
		while(h<n) {
			finalArray[t]=a[h];
			t++;
			h++;
		}
		System.out.println("output of array :");
		for(int o:finalArray) {
			System.out.print(o+" ");
		}
	}
}
