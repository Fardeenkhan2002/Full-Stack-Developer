
import java.util.*;
public class ProfitLoss
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter cost price: ");
	int cp = sc.nextInt ();
	  System.out.print ("Enter Selliing price: ");
	int sp = sc.nextInt ();

	if (sp > cp)
	  {
		int x = sp - cp;
		  System.out.println ("Profit: " + x);
	  }
	else
	  {
		int x = cp - sp;
		System.out.println ("Loss: " + x);
	  }
  }
}
