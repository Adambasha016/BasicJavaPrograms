package org.practice.marathahalli;

public class StringDemo10 {
	public static void main(String[] args) {
		String s1="java is an oop language";
		char[] a = s1.toCharArray();
		String  s2="";
		int   i=a.length-1,j=a.length-1;
		while(j>-1) {
			while(j>-1&& a[j]!=' ') j--;
			String temp="";
			int k=j+1;
			while(k<=i) temp+=a[k++];
			s2+=temp;
			if(j>-1) s2+=" ";
			i=--j;

		}
		System.out.println(s2);
	}
}
