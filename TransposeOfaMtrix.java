
public class TransposeOfaMtrix {
 public static void main(String[] args) {
	 
	 int [][]a= { {1,2,3},
			      {4,5,6},
			      {7,8,9}
			     }; 
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			int temp=a[i][j];
//			a[i][j]=a[j][i];
//			a[j][i]=temp;
//		}
//	}
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
	 
	for(int []as:a) {
		for(int s:as) {
			System.out.print(s);
		}
		
		System.out.println();
	}
}
}
