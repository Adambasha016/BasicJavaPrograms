package org.practice.marathahalli;

import java.util.HashSet;
import java.util.Set;

class Student2{
	String name;
	int marks;
	Student2(String n,int m){
		this.name=n;
		this.marks=m;
	}
	@Override
	public int hashCode() {
return marks;
	}
	@Override
	public boolean equals(Object obj) {
if(!(obj instanceof Student2)) return false;
Student2 s=(Student2)obj;
return name.equalsIgnoreCase(s.name)&&marks==s.marks;
	}		
	@Override

	public String toString() {

	return "name ="+name+", marks ="+marks;
	}
}
public class PrimitiveHashCode {
public static void main(String[] args) {
	Student2 s1=new Student2("punith", 89);
	Student2 s2=new Student2("karuna", 78);
	Student2 s3=new Student2("mubark", 69);
	Student2 s4=new Student2("punith", 89);
	String string = s1.toString();
	String stg = s2.toString();
	String sr= s3.toString();
	String se = s4.toString();
	System.out.println(string+"\r"+stg+"\r"+sr+"\r"+se);
	boolean b = s1.equals(s2);
	boolean r = s1.equals(s4);
	System.out.println(b+"\r"+r);
	  

	 Set st=new HashSet();
	 st.add(s1);
	 st.add(s2);
	 st.add(s3);
	 st.add(s4);
	 System.out.println(st.size());
}
}
