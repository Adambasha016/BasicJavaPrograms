package org.basavannagudi.jsp.Welldoc;

public class Demo09 {
public static void main(String[] args) {
	
	int []x= {1,3,0,2,2,4,2};
	int p=0;
	int count =x.length;
	System.out.println(count);
	for(int i=1;i<=count-1;i++) {
		if(x[i]>x[i-1]) {
			p=p+1;
		}
	}
	System.out.println(p);
}
}
