package org.practice.marathahalli;

public class DemoThread1 {
	
	public static void main(String[] args) {
		System.out.println("main thread starts");
		int y=90;
		Thread ab=new Mno();
		ab.setName("allen");
		ab.start();
		Thread xy= new Mno();
		xy.setName("smith");
		xy.start();
		
		Thread we = Thread.currentThread();
		System.out.println(we.getName()+" "+we.isDaemon());
		System.out.println("main ends");
	}
	} 
class     Mno extends Thread
{
	@Override
	public void run() {
		Thread q = Thread.currentThread();
		System.out.println(q.getName()+"   this method is executed by   "+q.isDaemon());
	}
}

