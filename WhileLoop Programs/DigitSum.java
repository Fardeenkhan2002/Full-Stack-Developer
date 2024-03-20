import java.util.*;
public class DigitSum
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number: ");
	int n = sc.nextInt ();
	int sum = 0;
	while (n > 0)
	  {
		int r = n % 10;
		  sum = sum + r;
		  n = n / 10;
	  }
	System.out.println ("Sum of digits is " + sum);
  }
}
