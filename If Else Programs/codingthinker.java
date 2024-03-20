import java.util.*;
public class codingthinker
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter the no. ");
	int n = sc.nextInt ();

	if (n % 2 == 0)
	  {
		if (n % 3 == 0)
		  {
			System.out.println ("coding thinker");
		  }
		else
		  {
			System.out.println ("coding");
		  }


	  }
	else
	  {
		if (n % 3 == 0)
		  {
			System.out.println ("thinker");
		  }
		else
		  {

		  }

	  }


  }
}
