import java.util.*;
public class CheckTriangle
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);

	  System.out.println ("Enter the Value A:");
	int A = sc.nextInt ();
	  System.out.println ("Enter the Value B:");
	int B = sc.nextInt ();
	  System.out.println ("Enter the Value C:");
	int C = sc.nextInt ();

	if (A + B > C)
	  {
		if (B + C > A)
		  {
			if (A + C > B)
			  {
				System.out.println ("valid");
			  }
			else
			  {
				System.out.println ("Not valid");
			  }
		  }
		else
		  {
			System.out.println ("Not valid");
		  }
	  }
	else
	  {
		System.out.println ("Not valid");
	  }
  }
}
