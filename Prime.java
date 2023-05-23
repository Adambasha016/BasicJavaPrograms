import java.util.Scanner;
class Prime 
{
	public static void main(String[] args)
{
		System.out.println("Enter the num");
		int a=new Scanner(System.in).nextInt();
		for(int i=1;i<=a;i++)
		{
			boolean flag=true;
			if(i<=1)continue;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)System.out.println(i);
		}
}
}
