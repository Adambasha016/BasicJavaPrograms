package org.practice.marathahalli;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		int [] [] arr= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(" before reverse of an array");

		TransposeOfAnArray.printAn2DAray(arr);
		revese2dMatrix(arr);
		System.out.println(" after reverse of an array");
		TransposeOfAnArray.printAn2DAray(arr);
	}


	public static void revese2dMatrix(int [] []a) {
		for(int i=0;i<a.length;i++) {
			int left=0;
			int right=a[i].length-1;
			while(left<right) {
				int temp=a[i][left];
				a[i][left]=a[i][right];
				a[i][right]=temp;
				left++;
				right--;
			}
		}

	}
}