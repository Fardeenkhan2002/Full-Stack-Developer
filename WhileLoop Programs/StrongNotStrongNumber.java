import java.util.*;
public class StrongNotStrongNumber
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number: ");
	int n = sc.nextInt ();
	int sum = 0;
	int temp = n;
	while (n > 0)
	  {
		int r = n % 10;
		int f = 1;
		for (int i = 1; i <= r; i++)
		  {

			f = f * i;
		  }

		sum = sum + f;
		n = n / 10;
	  }


	if (sum == temp)
	  {
		System.out.println (" Its Strong Number");
	  }
	else
	  {
		System.out.println ("Its not Strong Number");

	  }
  }
}
