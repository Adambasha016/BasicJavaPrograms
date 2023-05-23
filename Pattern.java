package org.basavannagudi.jsp.Welldoc;

import java.util.Scanner;

public class Pattern {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enater a number");
	int int1 = s.nextInt();
	for(int i=1;i<=int1;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

}
