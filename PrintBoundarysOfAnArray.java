package org.practice.marathahalli;

public class PrintBoundarysOfAnArray {


	public static void main(String[] args) {
		int [][]ar= { {1,2,3,4,5},
				      {6,7,8,9,10},
				      {11,12,13,14,15},
				      {16,17,18,19,20},
				      {21,22,23,24,25},};
		int i=0,j=0;
		for(j=0;j<ar.length;j++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		j=ar.length-1;
		for(i=1;i<ar.length;i++) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		i=ar.length-1;
		for(j=ar.length-2;j>=0;j--) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
		j=0;
		for(i=ar.length-2;i>0;i--) {
			System.out.print(ar[i][j]+" ");
		}
		System.out.println();
	}
}

