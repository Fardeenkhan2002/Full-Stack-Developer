import java.util.*;
public class equal
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt ();
	  System.out.println ("kakapppudon hight");
	int b = sc.nextInt ();
	  System.out.println ("toseefkhan hight");

	if (a > b)
	  {
		System.out.print ("kakapppudon is taller");

	  }



	else
	  {
		if (a == b)
		  {
			System.out.print ("both are equal");
		  }

		else
		  {
			System.out.println ("toseefkhan");

		  }

	  }
  }
}
