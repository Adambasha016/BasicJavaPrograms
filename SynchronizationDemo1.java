package org.practice.marathahalli;
class PrintShop{
	synchronized public void print(int a,int b) {
		for(int i=a;i<=b;i++){
			System.out.print(i+"  ");
		
			try {
				Thread.sleep(500 );
				System.out.println("total active teeads  "+Thread.activeCount()+" "+Thread.currentThread().getName());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Custom extends Thread{
	PrintShop ab;
	int x;
	int y;
	public Custom(PrintShop ab,int x,int y) {
		this.ab=ab;
		this.x=x;
		this.y=y;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		ab.print(x, y);
	}
	
	
	
}
public class SynchronizationDemo1 {
	public static void main(String[] args) {
		
	
PrintShop a1=new PrintShop();
       Custom cu = new Custom(a1,10,40);
       cu.setName("smith");
       cu.start();
 
       
      new Custom(a1,60,100).start();
      Thread th = Thread.currentThread();
      System.out.println(Thread.activeCount()+" "+th.getName()+""+th.isDaemon());
}
}
