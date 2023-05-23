 package org.practice.marathahalli;

public class ThisDemo1 {
public static void main(String[] args) {
	Circle c1=new Circle(10);
	Circle c2=new Circle(20);
	//c1.dispaly(c2);
	//c2.dispaly(c1);
	//c1.dispaly(c1);
	c1.dispaly(new Circle(30));
}
}
	class Circle{
		
	
int radius;
 public Circle( int r){
	this.radius=r;	
}
void dispaly(Circle arg ) {
	System.out.print(this.radius);
	System.out.print(arg.radius);
}
}
