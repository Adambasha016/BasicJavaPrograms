
public class B
{
	public static void main(String[] args)
	{
		int i=1,j=5;
		a: for( ; ; )
		{
			for( ; ; )
			{
				if(++i>--j) break a;
			}
		}
		System.out.println(i +""+ j);
	}
	
}
