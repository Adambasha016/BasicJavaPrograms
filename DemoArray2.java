
public class DemoArray2 {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	int lenthofchild=3;
	int k=0;
	int totalsubarray= (lenthofchild+n)/lenthofchild;	
			for(int i=0;i<totalsubarray;i++) {
				System.out.print("{");
				for(int j=0;j<lenthofchild;j++) { 
               
					if(k<arr.length)  System.out.print(arr[k++]);
					if(j <lenthofchild-1&&k<arr.length) System.out.print(",");
						}
				System.out.print("}");
				System.out.println();  
			}
			
			
			
			
			
}
}
