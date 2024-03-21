// package patternprinting.compositePattern.java;

import java.util.*;

public class PyramidPaindrome
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter n : ");
	int n = sc.nextInt ();

	for (int i = 1; i <= n; i++)
	  {							//rows
		for (int j = 1; j <= n - i; j++)
		  {						//coloumn

			System.out.print ("#" + " ");
		  }
		for (int j = 1; j <= i; j++)
		  {
			System.out.print (j + " ");
		  }

		for (int j = i - 1; j >= 1; j--);
		{
		  System.out.print ("j" + " ");
		}
		System.out.println ();
	  }
  }
}
