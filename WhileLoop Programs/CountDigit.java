import java.util.*;
public class CountDigit
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number: ");
	int n = sc.nextInt ();
	int count = 0;
	while (n > 0)
	  {
		count++;
		n = n / 10;
	  }
	System.out.println ("No. of digits: " + count);
  }
}
