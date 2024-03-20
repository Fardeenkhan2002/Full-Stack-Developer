import java.util.*;
public class Sum1stAndLastNumber
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter the value : ");
	int n = sc.nextInt ();
	int r = 0;
	int lin = n % 10;
	while (n > 0)
	  {
		r = n % 10;
		n = n / 10;
	  }


	System.out.print (lin + r);
  }
}
