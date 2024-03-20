
import java.util.*;
public class Fine
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter no of Units");
	int n = sc.nextInt ();

	if (n <= 3)
	  {
		System.out.println ("Fine is 10rs");
	  }
	else
	  {
		if (n <= 10)
		  {
			System.out.println ("Fine is 20rs");
		  }
		else
		  {
			if (n <= 30)
			  {
				System.out.println ("Fine is 50rs");
			  }
			else
			  {
				System.out.
				  println ("fine is 50 and your membership is cancelled");
			  }
		  }
	  }
  }
}
