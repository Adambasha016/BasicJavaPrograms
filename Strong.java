import java.util.Scanner;
public class Strong 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		int a=new Scanner(System.in).nextInt();
		int b=a;
		int sum=0;
		int e=1;
		for(int i=10;a>0;a/=10)
		{
			int c=a%i;
			for(int j=1;j<=c;j++)
			{
				e*=j;
			}
		sum+=e;
		e=1;
		}
		if(b==sum)
			System.out.println(b+" is a strong num");
		else
			System.out.println(b+" is not a strong num");
	}
}
