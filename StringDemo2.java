package org.practice.marathahalli;

public class StringDemo2 {
public static void main(String[] args) {
	
	String s1="234jsp678";
	int count=0;
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		if(c>='0'&&c<='9')count++;
	}
	System.out.println(count);
	Demo.main(" a");
}
}
 class Demo{
	 
	public static  void main(String string) {
		String s1="jspiders";
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,7));
	}
}
