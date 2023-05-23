package org.practice.marathahalli;

import java.util.Scanner;

public class StringDemo5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String ne= sc.next();
		while(ne.length()>0) {
			char c = ne.charAt(0);
			String string = ne.replace(c+"",""); 
			int n=	ne.length()-string.length();

			System.out.println(c+"--->"+n);
			ne=string;
		}
	}
}
