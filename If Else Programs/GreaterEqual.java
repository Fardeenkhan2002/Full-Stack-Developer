import java.util.*;
public class GreaterEqual
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
		System.out.print ("a is greater");
	  }
	else
	  {
		if (a == b)
		  {
			System.out.print ("Both are equal");
		  }
		else
		  {
			System.out.print ("b is greater");
		  }
	  }
  }
}
