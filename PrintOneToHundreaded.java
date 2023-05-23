 
class NumbePrinter implements Runnable{
	
	
	
	public NumbePrinter(int i) {
		// TODO Auto-generated constructor stub
		this.number=i;
	}

	private int number;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(number+"    ");
	}
	
	
}


public class PrintOneToHundreaded {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			NumbePrinter nu=new NumbePrinter(i);
			Thread t1=new Thread(nu);
			t1.start();
		}
	}

}
