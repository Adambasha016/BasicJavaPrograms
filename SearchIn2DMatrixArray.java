package org.practice.marathahalli;

public class SearchIn2DMatrixArray {

	public static void main(String[] args) {
		int [] [] arr= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		System.out.println(searchMartix(arr, 6  ));
	}




	public static boolean searchMartix(int [][]q,int target) {
		int i=0;
		int j=q[0].length-1;
		while(i<q.length&&j>-1) {
			if(q[i][j]==target) {
				System.out.println(q[i][j]+"    index:"+i+""+j);
				return true;

			}

			else if(q[i][j]>target)j--;
			else  i++;
		}
		return false;
	}

}
