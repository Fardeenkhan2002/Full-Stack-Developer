import java.util.*;
public class PalindromeNumber
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a number : ");
	int n = sc.nextInt ();
	int a = n;
	int ans = 0;
	while (n > 0)
	  {
		int r = n % 10;
		  ans = ans * 10 + r;
		  n = n / 10;
	  }
	ans = n;
	if (n == ans)
	  {
		System.out.print ("yes");

	  }
	else
	  {
		System.out.print ("no");

	  }

  }
}
