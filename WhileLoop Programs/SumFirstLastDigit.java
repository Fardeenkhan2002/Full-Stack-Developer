import java.util.*;
public class SumFirstLastDigit
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number: ");
	int n = sc.nextInt ();
	int ld = n % 10;
	int r = 0;
	while (n > 0)
	  {
		r = n % 10;
		n = n / 10;
	  }
	System.out.println ("Sum of first and last digit is: " + (ld + r));
  }
}
