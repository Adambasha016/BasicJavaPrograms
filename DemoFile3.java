package org.practice.marathahalli;

import java.io.File;
import java.io.IOException;

public class DemoFile3 {
public static void main(String[] args) {
	File s=new File("C:\\users\\ELCOT\\Demo1\\Secondfile\\with\\out\\path\\creating\\new\\path\\wellcome\\to\\jspider\\marathahalli\\Hello.txt");
	//File s=new File("C:\\Program Files\\Java\\jdk1.8.0_333\\bin");
//	File s=new File("C:\\Users\\ELCOT"); to list the how maney files present
//	String[] list = s.list();
//	for(String arr:list) {
//		System.out.println(arr);
//	}
	try {
		System.out.println("is text file creaded "+  s.createNewFile());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
