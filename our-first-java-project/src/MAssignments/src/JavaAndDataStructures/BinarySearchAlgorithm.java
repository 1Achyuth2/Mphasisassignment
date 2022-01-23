package JavaAndDataStructures;

public class BinarySearchAlgorithm {
	 public static  void main(String[] args){


	        int[] arr = {23,37,3,51,59};
	        int key = 3;
	        int arrlength = arr.length;
	        bSearch(arr,0,key,arrlength);
	    }

	public static void bSearch(int[] a, int s, int k, int l){

	        int m = (s+l)/2;
	        while(s<=l){

	            if(a[m]<k){

	                s= m + 1;
	            } else if(a[m]==k){
	                System.out.println("Element is found at index :"+m);
	                break;
	            }else {

	                l=m-1;
	            }
	            m = (s+l)/2;
	        }
	            if(s>l){

	                System.out.println("Element is not found");
	            }
	      }
}
