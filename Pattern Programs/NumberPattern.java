import java.util.*;
public class NumberPattern
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter n : ");
	int n = sc.nextInt ();
	for (int i = 1; i <= n; i++)
	  {							//rows
		for (int j = 1; j <= n; j++)
		  {						//coloumn
			//System.out.print(j+" ");
			System.out.print (j + " ");
		  }

		System.out.println ();

	  }
  }


}
