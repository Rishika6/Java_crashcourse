public class Euler4 {

	public static void main(String[] args)
	{
		int i,j,t,n,r;
		int max=0;
		int rev=0;
		for(i=100;i<=999;i++)
		{
			for(j=100;j<=i;j++)
			{
				n=i*j;
				t=n;
				rev=0;
				while(n!=0)
				{
					r=n%10;
					rev=(rev*10)+r;
					n=n/10;
					if(t==rev)
					{
					   if(t>max)	
                                            max=t;
					}
			 
				}
			}
		}System.out.println(max);
}
}
