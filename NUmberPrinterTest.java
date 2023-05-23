package org.practice.marathahalli;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NUmberPrinterTest {
	public static void main(String[] args)  {
	System.out.println(Thread.currentThread().getName());
	ExecutorService ex= Executors.newFixedThreadPool(10);
	for(int i=1;i<=100;i++) {
	try {
		Thread.sleep(450);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	if(i==60) {
		System.out.println("Stop");
	}
	NumberPrinter nu=new NumberPrinter(i);
	//Thread t=new Thread(nu);
	ex.execute(nu);
	}
	}

}
