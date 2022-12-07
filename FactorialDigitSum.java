package codex;
import java.util.*;
import java.math.BigInteger;
public class FactorialDigitSum {

	public static void main(String[] args)
	{
				int n=100;
				BigInteger p=BigInteger.ONE;
				while (n!=0)
				{
					p=p.multiply(BigInteger.valueOf(n));
					n--;
				}
				BigInteger sum = BigInteger.valueOf(0);
				BigInteger mod = BigInteger.valueOf(0);
				while (!p.equals(BigInteger.ZERO)) {
					mod=p.mod(BigInteger.valueOf(10));
					sum=sum.add(mod);
					p=p.divide(BigInteger.valueOf(10));
				}
				System.out.println(sum);
			}

		}
