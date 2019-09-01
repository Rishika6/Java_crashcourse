public class euler2
{
	public static void main(String args[])
	{
		int n1=1,n2=2;
		int sum=0;
		int n3;
		do
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n3%2==0)
			{
				sum=sum+n3;
			}
		}while(n3<=4000000);
		System.out.println(sum+2);
	}

}
