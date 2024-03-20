import java.util.*;
public class 1 stAndLastValueEnterChange
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter the value: ");
	int n = sc.nextInt ();
	int z = n;
	int c = 0;
	int r = 0;
	int l = n % 10;
	while (n > 0)
	  {
		r = n % 10;
		c++;
		n = n / 10;
	  }
	n = z;
	n = n / 10;
	n = n * 10 + r;
	n = n % (int) Math.pow (10, c - 1);
	n = l * (int) Math.pow (10, c - 1) + n;
	System.out.print (n);
  }
}
