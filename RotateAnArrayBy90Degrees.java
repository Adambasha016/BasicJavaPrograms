package org.practice.marathahalli;

public class RotateAnArrayBy90Degrees { 

	public static void main(String[] args) {


		int [] [] ar= {{1,2,3},   //7 4 1 
				{4,5,6},         //8 5 2
				{7,8,9}};        //9 6 3 
		 
		System.out.println(" before rotate");
		TransposeOfAnArray.printAn2DAray(ar);
		System.out.println(" step 1 transpose an array");
		TransposeOfAnArray.transpose(ar);
		System.out.println(" step 2 rotate an array ");
		ReverseOfAnArray.revese2dMatrix(ar);
		System.out.println(" print the out put");
		System.out.println(" ratated  array by 90degess");
		TransposeOfAnArray.printAn2DAray(ar);
	}


}
