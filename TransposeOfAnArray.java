package org.practice.marathahalli;

public class TransposeOfAnArray {
	public static void main(String[] args) {
		
	
	int [] [] ar= {{1,2,3},
			       {4,5,6},
			       {7,8,9}};
	printAn2DAray(ar);
	System.out.println(" transpose of an array");
	transpose(ar);
	printAn2DAray(ar);

	
	}
	
	public static void transpose(int [][]ar) {
	for(int i=0;i<ar.length-1;i++) {
		for(int j=i+1;j<ar.length;j++) {
			int temp=ar[i][j];
			ar[i][j]=ar[j][i];
			ar[j][i]=temp;
		}
	}
	}
	public static void printAn2DAray(int [][]a) {
		for(int []r:a) {
			for(int j:r) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
	
