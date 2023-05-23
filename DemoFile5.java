package org.practice.marathahalli;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;

public class DemoFile5 {
public static void main(String[] args) throws Exception {
	FileReader ad=new FileReader("C:\\users\\ELCOT\\Demo1\\Secondfile\\with\\out\\path\\creating\\new\\path\\wellcome\\to\\jspider\\marathahalli\\Hello.txt");
	BufferedReader s=new BufferedReader(ad);
	String re = s.readLine();
	while(re!=null) {
		System.out.println(re);
		re=s.readLine();
	}
	s.close();
	ad.close();
	
}
}
