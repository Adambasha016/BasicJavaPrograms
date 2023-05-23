
public class MergeSort {
public static void main(String[] args) {
	int [] a= {4,6,5,3,8,1,9,2,9};
mergeSort(a);	
	System.out.print("sorted elements --->merge sort { ");
	for(int s:a) {
		System.out.print(s+" ");
	}
	System.out.print("}");
}
	
	
	
	
	
	
	
	public static void mergeSort(int []a) {
		if(a.length==1) return;
		int []left=new int[a.length/2];
		int []right= new int [a.length-left.length];
		for(int i=0;i<left .length;i++) {
			left[i]=a[i];
		}
		int i=left.length;
		for(int j=0;j<right.length;j++,i++) {
			right[j]=a[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}
	
	private static void merge(int [] a,int []b,int []c) {
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length) {
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
		
		
		
	}
	
}
