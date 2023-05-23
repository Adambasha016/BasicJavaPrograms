package org.basavannagudi.jsp.Welldoc;

public class Demo11 {
public static void main(String[] args) {
  	int  a=20;
	int b=25;
	a++;
	b=b++;
	a++;
	int v=b;
	v++;
	a=a++;
	b=b++; 
	
//	main1(a, b);
	System.out.println(a+" "+b+""+v);
}
public static void main1(int a,int b) {
	increment(a, b);
	incrementagain(a, b);
	incrementagainagain(a, b);
	//return 1;
}
public static void increment(int a,int b) {
	a++;
	b=b++;
}
public static void incrementagain(int a,int b) {
	a++;
	int v=b;
	v++;
}
public static void incrementagainagain(int a,int b) {
	a=a++;
	b=b++;
}
}
