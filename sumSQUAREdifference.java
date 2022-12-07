package codex;

public class sumSQUAREdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int square=0;
      for(int i=1;i<=100;i++)
      {
    	  sum+=i;
    	  square+=i*i;
      }
      System.out.println((sum*sum)-square);
	}

}
