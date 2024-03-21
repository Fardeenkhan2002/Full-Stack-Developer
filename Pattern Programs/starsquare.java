import java.util.*;
public class starsquare
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter n");
	int m = sc.nextInt ();
	int n = sc.nextInt ();
	for (int i = 1; i <= m; i++)
	  {							//rows
		for (int j = 1; j <= n; j++)
		  {						//coloumn
			System.out.print (" * ");
		  }

		System.out.println ();

	  }
  }

}
