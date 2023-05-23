package org.practice.marathahalli;

class Ball{
	public Ball(int i) {
		System.out.println(i+" constructer Ball");
	}
}
class Bat extends Ball{
	Bat(){
		super(33);  // mandetary
		System.out.println("constructer BAt");
	}
	
}
public class SuperDemo4 {
public static void main(String[] args) {
	     new Bat();
	// new Ball(4);
}
}
