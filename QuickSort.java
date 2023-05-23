
public class QuickSort {
	public static void main(String[] args) {
		
	
	int [] a= {4,6,5,3,8,1,7,2,9};
quicksort(a, 0, a.length-1);
	System.out.print("sorted elements --->quick sort { ");
		for(int s:a) {
			System.out.print(s+" ");
		}
		System.out.print("}");
}	
	
	
  public  static void quicksort(int []a,int st,int end) {
	  if(st>=end) return;
	  int pivot =a[(st+end)/2];
	  int i=st,j=end;
	  while(i<=j) {
		  while(a[i]<pivot)i++;
		  while(a[j]>pivot)j--;
		  if(i<=j) {
			  int temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;
			  i++;
			  j++;
		  }
	  }
	  quicksort(a,st, j);
	  quicksort(a, i, end);
  }
}

