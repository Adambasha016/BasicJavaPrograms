package org.practice.marathahalli;

public class SubString {
public static void main(String[] args) {
	String s1="malayalam";
	for(int i=0;i<s1.length()-1;i++) {
		for(int j=i+2;j<s1.length();j++) {
			String s2=s1.substring(i, j);
			if(StringPalindrome.ispallandrome(s2)) System.out.println(s2);
		}    
	}
}
}
