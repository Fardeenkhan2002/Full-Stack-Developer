import java.util.*;
public class Difference
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter 1st number: ");
	int a = sc.nextInt ();
	  System.out.print ("Enter 2nd number: ");
	int b = sc.nextInt ();

	if (a > b)
	  {
		int diff = a - b;
		  System.out.print ("Difference is: " + diff);
	  }
	else
	  {
		int diff = b - a;
		System.out.print ("Difference is: " + diff);
	  }
  }
}
