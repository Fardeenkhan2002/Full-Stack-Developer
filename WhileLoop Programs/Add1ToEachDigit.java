import java.util.*;
public class Add1ToEachDigit
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number: ");
	int n = sc.nextInt ();
	int num = 0;
	int p = 1;
	while (n > 0)
	  {
		int r = n % 10;
		  num = ((r + 1) % 10) * p + num;
		  n = n / 10;
		  p = p * 10;
	  }
	System.out.println ("Number after add 1 to each digit: " + num);
  }
}
