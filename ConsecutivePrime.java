package codex;

public class ConsecutivePrime {

	public static void main(String[] args)
	{
		int sum1=0,sum2=0,f,t=0;
		for(int i=1;i>0;i++)
		{
			f=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					f++;
				}
			}
			if(f==2)
			{
				sum1=sum1+i;
				if(sum1>=1000000)
				{
					break;
				}
				t++;
				sum2=sum1;
			}
		}
		System.out.println("longest sum of consecutive primes below one-million that adds to a prime; contains "+t+" terms and is equal to "+sum2);
	
	}

}
