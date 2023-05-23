package org.practice.marathahalli;

public class StringDemo4 {
public static void main(String[] args) {
	String s3="developer";
	int n=s3.length()-s3.replace("e","").length();
	System.out.println(n);
	
	
	String s1="java is an oop lang java is plat ind";
	
	
	s1=s1.toLowerCase();
int u=s1.length()-s1.replace("java","").length();
int y=u/"java".length();
System.out.println(u+" "+y);
System.out.println(y);

}
}
