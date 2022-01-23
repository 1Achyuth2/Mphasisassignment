package JavaAndDataStructures;

public class QuickSortAlgorithm {
	int partition (int a[], int s, int e)  
	{  
	    int p= a[e];
	    int i = (s - 1);  
	  
	    for (int j = s; j <= e- 1; j++)  
	    {  
	        if (a[j]<p)  
	        {  
	            i++; 
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[e];  
	    a[e] = t;  
	    return (i + 1);  
	}  
	void quick(int a[], int s, int e)  
	{  
	    if (s<e)  
	    {  
	        int p = partition(a, s, e);   
	        quick(a, s, p - 1);  
	        quick(a, p + 1,e);  
	    }  
	}  
	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i]+" ");  
	}  
	    public static void main(String[] args) {  
	    int a[] = { 13, 18, 27, 2, 19, 25 };  
	    int n = a.length;  
	    System.out.println(" Actual array elements are - ");  
	    QuickSortAlgorithm q1 = new QuickSortAlgorithm();  
	    q1.printArr(a, n);  
	    q1.quick(a, 0, n - 1);  
	    System.out.print("\nsorting array elements are - ");  
	    q1.printArr(a, n);  
	    System.out.println();  
	    } 
}
