
public class DemoArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	int lenthofchild=3;
	int k=0;
	int totalsubarray= (lenthofchild+n)/lenthofchild;			
			for(int i=0;i<totalsubarray;i++) {
				System.out.print("{");
				for(int j=0;j<lenthofchild;j++) {
					if(k<arr.length)System.out.print(arr[k++]);
					if(j<3-1&&k<arr.length) System.out.print(",");
						}
				System.out.print("}");
				System.out.println();
			}
			
			
			
//			int[][] ans=new int[totalsubarray][lenthofchild];
//			
//			int k=0;
//			for(int i=0;i<ans.length;i++) {
//				for(int j=0;j<ans[i].length;j++) {
//					ans[j]=arr[k++];
//					
//				}
//			}
//			for(int []a:ans) {
//				System.out.print("{");
//				for(int g:a) {
//					System.out.print(g);
//					if(a.length<3) {
//						System.out.print(",");
//						
//					}
//				}
//				System.out.print("}");
//				System.out.println();
//			}
//			
	
	
}
}
