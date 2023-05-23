import java.util.Scanner;

public class ArrayRotating {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int[] a= new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
			System.out.println("ele  "+i+" ");
		a[i]=sc.nextInt();
		}  
		for(int e:a) {
			System.out.print(e);
		}
		System.out.println();
		System.out.println("enter rotate num");
		System.out.println();
		rotateArray(a, sc.nextInt(), a.length);
		for(int g:a) {
			System.out.print(g);
		}
	}
	public static void rotateArray(int []a,int b,int n) {
		int p=1;
		while(p<=b) {
			int last=a[0];
			for(int i=0;i<n-1;i++) {
				a[i]=a[i+1];
			}
			a[n-1]=last;
			p++;
		}
	}

}
