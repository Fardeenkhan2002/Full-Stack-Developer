import java.util.*;
public class greter
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print (" Enter 1st number: ");
	int a = sc.nextInt ();
	  System.out.print (" Enter 2nd Number: ");
	int b = sc.nextInt ();
	  System.out.print (" Enter 3rd Number: ");
	int c = sc.nextInt ();

	if (a > b)
	  {
		if (a > c)
		  {
			System.out.print (a + " is greter");
		  }
		else
		  {
			System.out.print (c + " is greter");
		  }

	  }
	else
	  {
		if (b > c)
		  {
			System.out.print (b + " is greter");
		  }
		else
		  {
			System.out.print (c + " is greter");
		  }
	  }

  }
}
