import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Executerw {
	public static void main(String[] args) {
		//Executor ex=Executors.newFixedThreadPool(nThreads:20);
		for(int i=0;i<=100;i++) {
			NumbePrinter nu1=new NumbePrinter(i);
		//	ex.execute(nu1);
		}
		
	}

}
