package org.basavannagudi.jsp.Welldoc;

public class Demo06 {
public static void main(String[] args) {
	int [] a= {7,3,8,1,0,5};
	int temp=a[0];
	for(int i=0;i<=a.length-2;i++) {
		a[i]=a[i+1];
		
	}
	a[a.length-1]=temp;
	//System.out.println(a.length-2);
	
	for(int d:a) {
		System.out.print(d);
	}
	
}
}
