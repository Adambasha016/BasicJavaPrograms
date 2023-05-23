import java.util.Scanner;

public class Fibvpattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		int fibline=scn.nextInt();
		int fibspace=fibline*2-1;
		int space=0;
		int a=1,b=2;
		for(int j=1;j<=fibline;j++) {
			for(int i=1;i<=space;i++) {
				System.out.print(" ");
			}
			for(int i=1;i<=fibspace;i++) {
				if(i==1||i==fibspace) {
					int c=a+b;
					if(j==fibline)System.out.print(" ");
					System.out.print (a+" ");
					a=b;b=c;
				}
				else System.out.print(" ");
			}
			System.out.println();
			space++;
			fibspace-=2;
		}

	}

}
