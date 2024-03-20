import java.util.*;
public class YearMonthWeek
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter no. of days: ");
	int d = sc.nextInt ();

	int n = 0;
	if (d >= 365)
	  {
		n = d / 365;
		d = d % 365;
		System.out.println ("Year: " + n);
	  }
	if (d >= 30)
	  {
		n = d / 30;
		d = d % 30;
		System.out.println ("Month: " + n);
	  }
	if (d >= 7)
	  {
		n = d / 7;
		d = d % 7;
		System.out.println ("Week: " + n);
	  }
	if (d >= 1)
	  {
		System.out.println ("Days: " + d);
	  }
  }
}
