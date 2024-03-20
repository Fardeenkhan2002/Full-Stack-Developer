import java.util.*;
public class ElectricityBill
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter no of units: ");
	int n = sc.nextInt ();
	float ans = 0;
	if (n <= 100)
	  {
		ans = n * 4;
	  }
	else if (n <= 200)
	  {
		ans = (100 * 4) + (n - 100) * 5;
	  }
	else if (n <= 300)
	  {
		ans = (100 * 4) + (100 * 5) + (n - 200) * 6;
	  }
	else if (n <= 400)
	  {
		ans = (100 * 4) + (100 * 5) + (100 * 6) + (n - 300) * 7;
	  }
	else
	  {
		ans = (100 * 4) + (100 * 5) + (100 * 6) + (100 * 7) + (n - 400) * 8;
	  }
	ans += ans * 0.1f;			// ans = ans + (ans*0.1f)
	System.out.println ("Total amount is: " + ans);
  }
}
