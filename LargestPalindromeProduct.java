package codex;
import java.util.*;
public class LargestPalindromeProduct {

	public static void main(String[] args)
	{
				int a[]=new int[1000];
				int c=0;
				for(int i =999; i>100; i--){
			        for(int j = 999; j>100; j--){
			            int p= j*i;
			            if(isPalindrome(p))
			            {
			                a[c]=i*j;
			                c++;
			                break;
			            }
			        }
			    }
				int max=Integer.MIN_VALUE;
				for (int i=0;i<1000;i++)
				{
					if (a[i]>max)
						max=a[i];
				}
				System.out.println(max);
			}
			static boolean isPalindrome(int a) 
			{
				int r=a;
				int rem=0,sum=0;
				while(r!=0)
				{
					rem=r%10;
					sum=sum*10+rem;
					r=r/10;
				}
				if (a==sum)
					return true;
				return false;
			}

		}
