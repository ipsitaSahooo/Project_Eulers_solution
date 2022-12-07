package codex;
import java.math.BigInteger;
import java.util.*;

public class SelfPowers 
{
	public static void main(String[] args) 
	{	
		String n;
		BigInteger sum = BigInteger.ZERO;
		
		for(int i=1;i<=1000;i++)
		{
			sum=sum.add(BigInteger.valueOf(i).pow(i));
			
		}
		n=sum.toString();
		n=n.substring(n.length()-10);
		System.out.println(n);
	}

}
