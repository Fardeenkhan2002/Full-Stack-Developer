import java.util.*;
public class OddEvenDifferentSum
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter count: ");
	int n = sc.nextInt ();
	int EvenSum = 0;
	int OddSum = 0;

	for (int i = 1; i <= n; i++)
	  {
		int x = sc.nextInt ();
		if (x % 2 == 0)
		  {
			EvenSum = EvenSum + x;
		  }
		else
		  {
			OddSum = OddSum + x;
		  }
	  }


	{
	  System.out.println ("OddSum :" + OddSum + "\nEvenSum :" + EvenSum);
	}

  }

}
