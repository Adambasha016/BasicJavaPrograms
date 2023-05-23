package org.practice.marathahalli;
//----------->main method at StringDemo7<-----------//   
public class StringDemo9 {
	
	static void permutation(String s,int start,int end) {
		if(start>=end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++) {
			String s1=swap(s,start,i);
			permutation(s1,start+1,end);
		}
	}
	
	
	static String swap(String w,int i,int j) {
		char[] array = w.toCharArray();
		char temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		return new String(array);
		
	}

}
