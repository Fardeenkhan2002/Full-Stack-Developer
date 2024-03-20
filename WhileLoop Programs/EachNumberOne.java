import java.util.*;
public class EachNumberOne
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter the value: ");
	int n = sc.nextInt ();
	int y = 1;
	int a = 0;

	while (n > 0)
	  {
		int r = n % 10;
		if (r == 9)
		  {
			r = 0;
		  }
		else
		  {
			r++;
		  }
		a = (r * y) + a;
		n = n / 10;
		y = y * 10;
	  }
	System.out.print (a);
  }

}
