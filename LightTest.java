package org.practice.marathahalli;

import java.util.Scanner;

public class LightTest {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter the type of light");
	String next = sc.next();
	Iswitch lihght = LightFactory.getLihght(next);
	if(lihght!=null) {
		lihght.Son();
		lihght.sOff();
	}
}
}
