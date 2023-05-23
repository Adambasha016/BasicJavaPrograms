package org.practice.marathahalli;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoFile4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		FileWriter a=new FileWriter("C:\\users\\ELCOT\\Demo1\\Secondfile\\with\\out\\path\\creating\\new\\path\\wellcome\\to\\jspider\\marathahalli\\Hello.txt");
	BufferedWriter b= new BufferedWriter(a);
	System.out.println("enter the text");
	String line = sc.nextLine();
	b.write("hi good marning ");
	b.write(line+"\n ");
	b.write("please do not sleep");
	System.out.println("data writen ");
	b.flush();
	a.close();
	sc.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
}
}
