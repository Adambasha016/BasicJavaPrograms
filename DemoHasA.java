package org.practice.marathahalli;
class B{
	int i;
	B(int i){
		this.i=i;
	}
}
class A
{
	B b;
	A(B arg){
		b=arg;
	}
      void  m1(){
		System.out.println(b.i);
	}
}
public class DemoHasA {
public static void main(String[] args) {
	A a1=new A(new B(10));
	a1.m1();
	System.out.println(a1.b.i);
}
}
