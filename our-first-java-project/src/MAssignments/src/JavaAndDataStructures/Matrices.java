package JavaAndDataStructures;

public class Matrices {
public static void main(String[] args) {
	int a[][]= {
			{5,4,6},
			{3,8,9},
			{5,6,7}
			};
	int b[][]= {
			{5,2,1},
			{6,7,9},
			{9,3,5}
			};
	int rows=a.length;
	int col=a[0].length;
	
	int add[][]=new int[rows][col];
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			add[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<rows;i++) {
		for(int j=0;j<col;j++) {
			System.out.print(add[i][j]+" ");
		}
		System.out.println();
		}
}
}
