
public class InsetionSort {

	
	public static void main(String[] args) {
		int [] a= {4,6,5,3,8,1,9,2,9};
		insertionSort(a);
		System.out.print("sorted elements --->insertion sort { ");
		for(int s:a) {
			System.out.print(s+" ");
		}
		System.out.print("}");
	}
	
	
	
	
	public static void insertionSort(int a[]) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while (j>-1&&a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
