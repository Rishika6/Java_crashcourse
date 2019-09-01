

public class Euler7 {

	public static void main(String[] args)
	{
		int n=1;
		int prime=1;
		int number=1;
		
		while(prime!=10001)
		{
			for(int i=2;i<=n;i++)
			{
				if(n%i!=0)
				{
					number=n;
					prime++;
					
				}
			}
		
		if(n==2)
		{
			n++;
		}
		n++;
		}
		System.out.println(number);
	}

}