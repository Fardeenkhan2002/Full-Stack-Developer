import java.util.*;
public class AtmMachine
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter Amount (In multiples of 100): ");
	int amt = sc.nextInt ();
	int n = 0;
	if (amt % 100 == 0)
	  {
		if (amt >= 2000)
		  {
			n = amt / 2000;
			amt = amt % 2000;
			System.out.println ("2000 notes: " + n);
		  }
		if (amt >= 500)
		  {
			n = amt / 500;
			amt = amt % 500;
			System.out.println ("500 notes: " + n);
		  }
		if (amt >= 200)
		  {
			n = amt / 200;
			amt = amt % 200;
			System.out.println ("200 notes: " + n);
		  }
		if (amt >= 100)
		  {
			n = amt / 100;
			amt = amt % 100;
			System.out.println ("100 notes: " + n);
		  }
	  }
	else
	  {
		System.out.
		  println ("Invalid amount - Please enter amount in multiple of 100");
	  }
  }
}
