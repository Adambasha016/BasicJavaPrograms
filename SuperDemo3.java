package org.practice.marathahalli;
class Banana{

	public Banana() {
		super();
		System.out.println("constructer in banana");
	}

}
class Mango extends Banana{
	public Mango() {
		super();  // optinal
		System.out.println("constructer in Mangoooooo");
	}
}
public class SuperDemo3 {
	public static void main(String[] args) {
	//	new Banana();  //---->only banana constructer get executed
		new Mango();  //----->Manago()---->Banana();

	}
}
