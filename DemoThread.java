class HelloWorld implements Runnable{
	@Override
	public void run() {
		System.out.println("hello world thread 0");
		// TODO Auto-generated method 0stub
		Thread r = Thread.currentThread();
		System.out.println(r.getName());
		System.out.println(r.getPriority());
	}
}
public class DemoThread {
	public static void main(String[] args) {
		HelloWorld hw=new HelloWorld();
		//hw.run();
		Thread e = Thread.currentThread();
	System.out.println(	e.getName()+"   "+e.getPriority());
		Thread t=new Thread(hw);
		t.start(); 
		System.out.println(t.getName());
		t.setName("smith");
		System.out.println(t.getName()+" tt");
System.out.println(		t.getPriority());
System.out.println(		t.currentThread());
		
	}

	
	
	
}
