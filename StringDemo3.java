package org.practice.marathahalli;

public class StringDemo3 {
public static void main(String[] args) {
	String s1="jspider";
	System.out.println(s1.indexOf('i'));
	System.out.println(s1.indexOf("pid"));
	System.out.println(s1.indexOf('s'));
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.indexOf('e', 2));	
	System.out.println(s1.indexOf('s', 4));
	String s2="developer";
	int i = s2.indexOf('e', s2.indexOf('e')+1);
	System.out.println(i);
	
	System.out.println(s2.replace('e', '@'));
	System.out.println(s2.replace("lop", "LOP"));
	System.out.println(s2.replace("e", " "));
	System.out.println(s2.replace("e", ""));
System.out.println(s2);
}
}
