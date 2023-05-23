
public class BubbleShort {
	public static void main(String[] args) {
		int [] a= {4,6,5,3,8,1,7,2,9};
		sortBUbble(a);
		System.out.print("sorted element ---> { ");
		for(int s:a) {
			System.out.print(s+" ");
		}
		System.out.print("}");
	}
	
	
	
	
	
	
	public static void sortBUbble(int []a) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
