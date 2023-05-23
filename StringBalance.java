package org.basavannagudi.jsp.Welldoc;

import java.util.Stack;

public class StringBalance {
public static void main(String[] args) {
	boolean b = isBalance("[this is a {paragraph]");
//{this is a paragraph}    	{,[,(,<,),],>,)     [this is a {paragraph]
	System.out.println(b);
}

public static boolean isBalance(String a) {
	Stack<Character> st=new Stack<>();
	for(int i=0;i<a.length();i++) {
		char c=a.charAt(i);
		if(c=='['||c=='{'||c=='('||c=='<') {
			st.push(c);
		}
		else if(c==']'||c=='}'||c==')'||c=='>') {
			if(st.isEmpty()||!pair(st.pop(),c)) return false;
		}
		
	}
	return st.isEmpty();
}
static boolean pair(char c1,char c2) {
if(c1=='['&&c2==']') return true;	
if(c1=='{'&&c2=='}') return true;	
if(c1=='('&&c2==')') return true;	
if(c1=='<'&&c2=='>') return true;
return false;
}
}
