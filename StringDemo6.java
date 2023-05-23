package org.practice.marathahalli;

public class StringDemo6 {
public static void main(String[] args) {
	String s1="hello";
	String s2="world";
	s1=s1+s2;   //s1=helloworld
	s2=s1.substring(0,s1.indexOf(s2));// s2=hello   (0,4)
	s1=s1.substring(s2.length());  //s1=world 5
	System.out.println(s1+"<---s1  s2--->"+s2);  //   world   hello
	
//	************************************************************//
	int i=10;
	int j=20;
	i=i+j;
	j=i-j;
	i=i-j;
	System.out.println(i+"<---i \rj--->"+j);
}

}
