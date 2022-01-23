package JavaAndDataStructures;

public class LongestIncreasingSequence {
	int increment(int a[],int length) {
		int seqarr[]=new int[length];
		int i,j,maximum=0;
		for(i=0;i<length;i++) {
			seqarr[i]=1;
		}
		for(i=0;i<length;i++) {
			for(j=0;j<i;j++) {
				if(a[i]>a[j] && seqarr[i]<seqarr[j]+1)
					seqarr[i]=seqarr[j]+1;
			}
		}
		for(i=0;i<length;i++) {
			if(maximum<seqarr[i])
				maximum=seqarr[i];
		}
		return maximum;
		}
	public static void main(String[] args) {
		int a[]= {66,93,54,100,12,71};
		int length=a.length;
		LongestIncreasingSequence l=new LongestIncreasingSequence();
		System.out.println("Longest increasing sequence length is : "+l.increment(a, length));
	}
}
