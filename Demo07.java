package org.basavannagudi.jsp.Welldoc;

public class Demo07 {
public static void main(String[] args) {
	int []x= {23,12,13,17,23,19,25};
	int count=6;
	int m=0;
	for(int i=0;i<=count-1;i++) {
		if(x[i]>x[m]) {
			m=i;
		}
	}
	System.out.println(m);
}

}
