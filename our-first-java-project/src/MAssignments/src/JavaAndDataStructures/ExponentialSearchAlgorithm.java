package JavaAndDataStructures;

import java.util.Arrays;
import java.util.Scanner;
public class ExponentialSearchAlgorithm {
	 public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    int[] a = {45,71,84,91,33,23,21,56,44,48,89};
		    Arrays.sort(a);
		    System.out.println("Sorted array- " + Arrays.toString(a));
		    System.out.println("Enter value : ");
		    int searchElement = s.nextInt();
		    int index = exponentialSearch(a, searchElement);
		    if(index != -1){
		      System.out.println("Searched value " + a[index] + " founded at index "+index);
		    }else{
		      System.out.println("Searched value " + searchElement + " not founded in the array");
		    }
		    s.close();
		  }
		    
		  private static int exponentialSearch(int[] arr, int searchElement){
		    int bound = 1;
		    while (bound < arr.length && arr[bound] < searchElement) {
		      bound *= 2;
		    }
		    return binarySearch(arr, bound/2, Integer.min(bound + 1, arr.length), searchElement);
		  }

		  private static int binarySearch(int[] arr, int start, int end, int searchElement){
		    if(start > end){
		      return -1;
		    }        
		    int m = (start+end)/2;
		    if(searchElement == arr[m]){
		      return m;
		    }
		    if(searchElement < arr[m]){
		      return binarySearch(arr, start, m-1, searchElement);
		    }else{
		      return binarySearch(arr, m+1, end, searchElement);        
		    }
		  }
}
