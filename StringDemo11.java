package org.practice.marathahalli;

public class StringDemo11 {
	static int secondLargestNumbe(int []a) {
		int max1=0;int max2=0;
		if(a[0]>a[1]) {    //   < second smallest
			max1=a[0];
			max2=a[1];
		}
		else {
			max1=a[1];
			max2=a[0];
		}
		for(int i=2;i<a.length;i++) {
			if(a[i]>max1) {  //    < second smallest
				max2=max1;
				max1=a[i];
			}
			else if (a[i]>max2) {    //   <  second smallest
				max2=a[i];
			}
		}
		return max2;
	}
public static void main(String[] args) {
	int [] a= {20,40,6,25,30,88};
System.out.println(secondLargestNumbe(a));
}
}
