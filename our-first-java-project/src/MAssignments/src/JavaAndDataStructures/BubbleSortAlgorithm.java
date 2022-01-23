package JavaAndDataStructures;

public class BubbleSortAlgorithm {
	 void bubbleSort(int a[])
	    {
	        int n = a.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (a[j] > a[j+1])
	                {
	                    int temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp;
	                }
	    }
	    void printArray(int r[])
	    {
	        int n = r.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(r[i] + " ");
	        System.out.println();
	    }
	    public static void main(String args[])
	    {
	        BubbleSortAlgorithm ob = new BubbleSortAlgorithm();
	        int arr[] = {45,67,31,54,99,34,81};
	        ob.bubbleSort(arr);
	        System.out.println("Sorted array ------>");
	        ob.printArray(arr);
	    }
}
