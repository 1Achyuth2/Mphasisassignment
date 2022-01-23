package JavaAndDataStructures;

public class InsertionSortAlgorithm {
	void sort(int a[])
    {
        int n = a.length;
        for (int i = 1; i < n; ++i) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
    }
    static void printArray(int s[])
    {
        int n = s.length;
        for (int i = 0; i < n; ++i)
            System.out.print(s[i] + " ");
 
        System.out.println();
    }
    public static void main(String args[])
    {
        int r[] = {50,10,9,34,22,85};
        InsertionSortAlgorithm o= new InsertionSortAlgorithm();
        o.sort(r);
        printArray(r);
    }
}
