package org.marathahalli.bosscoder;

import java.util.ArrayList;

public class Demo {
   public static void main(String[] args) {
	int []a= {1,15,13,8};
	int max=0;
	for(int i=0;i<a.length-1;i++) {
		int k=0;
		for(int j=i+1;j<a.length;j++) {
			k=(a[i]-a[j])+(i-j);
		}// o(n2)  //based on my resume write a about//headline  section for my linkedin profile in under 2500//200    words and her my resume 
		if(k>max) {
			max=k;
		}
	}
	System.out.println(max);
	
	
	
}
}
