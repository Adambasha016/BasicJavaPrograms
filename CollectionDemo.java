
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []ar= {"orange","apple","grape","mango","cherry","banana"};
		sorting(ar);
		for(int i=0;i<ar.length;i++) {
			if(i==0)System.out.print("{");
			System.out.print(ar[i]);
			if(i<ar.length-1)System.out.print(",");
			
		}
		System.out.print("}");
}
	 public static void sorting(String []a) {
		 for(int i=0;i<a.length-1;i++) {
			 for(int j=0;j<a.length-1-i;j++) {
				 if(a[j].compareTo(a[j+1])>0) {
					 String temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 
				 }
			 }
		 }
	}    

}
