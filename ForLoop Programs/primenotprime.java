import java.util.*;
public class primenotprime
{

  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("enter a number: ");


	int n = sc.nextInt ();
	int f = 0;

	for (int i = 2; i <= n / 2; i++)
	  {

		if (n % i == 0)
		  {

			f = 1;
			break;
		  }
	  }
	if (f == 0 && n != 1)
	  System.out.println (n + " is a prime number.");
	else
	  System.out.println (n + " is not a prime number.");


  }
}
