
public class SelectionSort {
	public static void main(String[] args) {
		int [] a= {4,6,5,3,8,1,9,2,9};
		selectionSort(a);
		System.out.print("sorted elements ---> SelectionSort { ");
		for(int s:a) {
			System.out.print(s+" ");
		}
		System.out.print("}");
	}
	
	
	
public static void selectionSort(int []b) {
	for(int i=0;i<b.length-1;i++) {
		int index=i;
		for( int j=i+1;j<b.length;j++) {
			if(b[j]<b[index]) {index=j;}
		}
		if(i!=index) {
			int tepm=b[i];
			b[i]=b[index];
		b[index]=tepm;
		}
		 
	}
}
}
