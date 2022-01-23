package JavaAndDataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortAlgorithm {
	    void sort(int arr[])
	    {
	        int g = arr.length;
	        for (int i = 0; i < g-1; i++)
	        {
	            int min = i;
	            for (int j = i+1; j < g; j++)
	                if (arr[j] < arr[min])
	                    min = j;
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }
	    }
	    void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	        SelectionSortAlgorithm o = new SelectionSortAlgorithm();
	        int a[] = {64,25,12,22,11};
	        o.sort(a);
	        System.out.println("Sorted array");
	        o.printArray(a);
	    }
}
