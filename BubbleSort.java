package org.practice.marathahalli;

public class BubbleSort {
public static void sort(int []a) {
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
public static void main(String[] args) {
	int a[]= {5,4,6,3,8,2,9,1,7};
	sort(a);
System.out.print("[");
	for( int n:a) {
		System.out.print(n+ "");
		if(n<a.length) System.out.print(",");
	}
	System.out.print("]");
}
}
