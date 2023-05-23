package org.practice.marathahalli;
// ----------->main method at StringDemo7<-----------//
public class StringDemo8 {
static String occuresOfANumber(String ae) {
	String s1="";
	while(ae.length()>0) {
		char c = ae.charAt(0);
		String string = ae.replace(c+"", "");
		int n=ae.length()-string.length();
		s1+=c+" -> "+n+"\r";
		ae=string;
		
	}
	return s1;
}
//********************************//
static String ocuurensOfaNumberAdvance(String we) {
	char[] cs = we.toCharArray();
	String s2="";
	int i=0;
	while(i<cs.length) {
		char c=cs[i];
		int count=1;
		while(true) {
			i++;
			if(i<cs.length&&cs[i]==c) count++;
			else break;
		}
		s2+=c+" -> "+count+"\r";
		}
	return s2;
		
	}
}


