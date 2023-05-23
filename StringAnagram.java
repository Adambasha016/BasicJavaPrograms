package org.practice.marathahalli;

public class StringAnagram {
public static void main(String[] args) {
	System.out.println(anagram("listen", "silent"));
}
	
	static boolean anagram(String s1,String s2)
	{
	while(true) {
		if(s1.length()==0&&s2.length()==0) return true;
		if(s1.length()!=s2.length()) return false;
		char c=s1.charAt(0);
		s1=s1.replace(c+"","");
		s2=s2.replace(c+"", "");
	}
	}
	
	
}
