package JavaAndDataStructures;

import java.util.Scanner;

public class LinearSearchAlgorithm {

	    public static void main(String[] args){

	        int[] arr = {20,33,41,76,100};

	        Scanner a = new Scanner(System.in);
	        System.out.println("Enter the element which should be search");
	        int s = a.nextInt();
	            int r = linearing(arr,s);
	            if(r==-1){
	                System.out.println("Element not founded in the array");
	            } else {
	                System.out.println("Element founded at "+r+" and the search key is "+arr[r]);
	            }
	        }
	public static int linearing(int arr[], int x) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == x) {
	            return i;
	        }
	     }
	            return -1;
	   }
	}
