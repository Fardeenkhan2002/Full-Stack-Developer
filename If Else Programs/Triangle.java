import java.util.*;
public class Triangle
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter the value A:");
	int a = sc.nextInt ();
	  System.out.print ("Enter the value B:");
	int b = sc.nextInt ();
	  System.out.print ("Enter the value C:");
	int c = sc.nextInt ();

	if (a == b)
	  {
		if (b == c)
		  {
			System.out.println ("Equilateral triangle");
		  }
		else
		  {
			System.out.println ("Isosceles triangle");
		  }
	  }
	else
	  {
		if (b == c)
		  {
			System.out.println ("Isosceles triangle");
		  }
		else
		  {
			if (a == c)
			  {
				System.out.println ("Isosceles triangle");
			  }
			else
			  {
				System.out.println ("Scalene triangle");
			  }
		  }
	  }

  }

}
