package org.practice.marathahalli;

public class NumberPrinter  implements Runnable{

	private int number;
	public NumberPrinter(int number) {
		this.number=number;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	if(number==60) {
		System.out.println("Break");
	}
	System.out.println("Number   "+number+"  printed b y     "+Thread.currentThread().getName());
	}
}
