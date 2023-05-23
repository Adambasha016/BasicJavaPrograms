package org.practice.marathahalli;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println(ispallandrome("malayalaM"));
	}

	static boolean ispallandrome(String a) {
		char[] cs = a.toLowerCase().toCharArray();
		int i=0,j=a.length()-1;
		while(i<=j) {
			if(cs[i]!=cs[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
