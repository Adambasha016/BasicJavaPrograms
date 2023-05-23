package org.practice.marathahalli;
class Apple{
	void kashmireApple() {
		System.out.println("white apple");
	}
}
class Bengaluru extends Apple{
	void kashmireApple() {
		System.out.println("red apple");
		//this.kashmireApple(); StackOverFlow
		super.kashmireApple();
	}
	// specific method
	void mejisticApple() {
		System.out.println("lalbhag apple");
	}
}
public class SuperDemo2 {
public static void main(String[] args) {
	
	
	Bengaluru b1=new Bengaluru();
	b1.kashmireApple();
	Apple b2=new Bengaluru();
	((Bengaluru)b2).mejisticApple();  //downcat
}
}
