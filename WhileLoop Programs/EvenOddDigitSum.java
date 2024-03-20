import java.util.*;
public class EvenOddDigitSum
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number: ");
	int n = sc.nextInt ();
	int evensum = 0;
	int oddsum = 0;
	while (n > 0)
	  {
		int r = n % 10;
		if (r % 2 == 0)
		  {
			evensum = evensum + r;
		  }
		else
		  {
			oddsum = oddsum + r;
		  }
		n = n / 10;
	  }
	System.out.println ("Sum of even digits is " + evensum);
	System.out.println ("Sum of odd digits is " + oddsum);
  }
}
