package codex;

public class highlyDivisorTriangle 
{
 public static void main(String[] args) 
{
	 int sum = 0;
     int c = 0;
     for (int i = 1; i <= Integer.MAX_VALUE; i++) {
         sum += i;
         for (int j = 1; j <= sum; j++) {
             if (sum % j == 0) {
                 c++;
             }
         }
         if (c > 500) {
             System.out.println(sum);
             break;
         } else {
             c = 0;
         }
     }
}
}
