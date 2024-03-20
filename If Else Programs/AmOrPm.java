import java.util.*;
public class AmOrPm
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter hour:");
	int h = sc.nextInt ();
	  System.out.print ("Enter minute:");
	int m = sc.nextInt ();
	if (h < 12)
	  {
		System.out.println (h + ":" + m + "AM");
	  }
	else
	  {
		if (h > 12)
		  {
			System.out.println ((h - 12) + ":" + m + " PM");
		  }
		else
		  {
			System.out.println (h + ":" + m + " PM");
		  }
	  }
  }

}
