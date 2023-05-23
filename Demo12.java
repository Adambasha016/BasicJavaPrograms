package org.basavannagudi.jsp.Welldoc;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		ArrayList<Integer> prime=new ArrayList<>();
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number");
		int a = sc.nextInt();
		System.out.println("enter s number");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			boolean flag=true;
			if(i<=1) continue;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				if(flag&&i%2!=0) {
					System.out.println("thums up"+i);
					prime.add(i);}
				if(i%2==0) {
					even.add(i);
					System.out.println("up"+i);}
			}
			if(flag!=true) {
				if(i%2==0) {
					even.add(i);
					System.out.println("up"+i);
				}
				if(i%2!=0) {
					odd.add(i);
					System.out.println("thumbs"+i);
				}

			}


		}
		System.out.println("primenumber-->"+prime+"\r"+"evennumber-->"+even+"\r"+" oddnumber--> "+odd);
		//System.out.println(even);
		//	System.out.println(odd);

	}
}
