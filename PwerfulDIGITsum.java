package codex;
import java.util.*;
import java.math.*;
public class PwerfulDIGITs {

	public static void main(String[] args) 
	{
		BigInteger res=BigInteger.TWO.pow(1000);
		String str=res.toString();
		int s=0;
		for (int i=0;i<str.length();i++)
		{
			s=s+str.charAt(i)-'0';
		}
		System.out.println(s);

	}

}
