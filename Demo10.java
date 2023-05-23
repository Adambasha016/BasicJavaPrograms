package org.basavannagudi.jsp.Welldoc;

public class Demo10 {
public static void main(String[] args) {
	int a=2;
	int b=2;
	int c=4;
	int m;
	if(a>=b) {
		if(a>c) {
			m=1;
		}
		else {
			m=2;
		}
	}
	else {
		if(c< 0) {
			m=3;
		}
		else {
			m=4;
		}
	}
	System.out.println(m);
}
}
