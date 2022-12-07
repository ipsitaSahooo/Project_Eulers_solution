package codex;

public class Prime10001st {

	public static void main(String[] args) 
	{
		int c1=0;
		for (int i=2;i>0;i++)
		{
			int c=0;
			for (int k=2;k<=i;k++)
			{
				if (i%k==0)
					c++;
			}
			if (c==1)
				c1++;
			if(c1==10001)
			{
				System.out.println(i);
			break;
			}
		}

	}

}
