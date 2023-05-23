package org.practice.marathahalli;

public class cCountOvels {
public static void main(String[] args) {
	String s1="jspider";
	int count=0;
	s1=s1.toLowerCase();
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			
		}
	}
	System.out.println(count);
}
}
