package org.practice.marathahalli;
class C{
	int i=98;
	
}
class D extends C{
	int i=38;
	void display() {
		System.out.println(i +"class d variable");
		System.out.println(super.i +"  class c variable");
	}
}
public class SuperDEmo1 {
	public static void main(String[] args) {
		
		D d1=new D();
		d1.display();
		
		//C d1=new D();
		//d1.dsplay(); specific methid
 //D d2=(D)d1;
	//d2.display(); 
	//	((D)d1).display();;

	}

}
