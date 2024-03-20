import java.util.*;
public class Add2NumDigitWise
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter 1st number ");
	int a = sc.nextInt ();
	  System.out.print ("Enter 2nd number ");
	int b = sc.nextInt ();
	int num = 0;
	int carry = 0;
	int p = 1;
	while (a > 0 && b > 0)
	  {
		int x = a % 10;
		int y = b % 10;
		int z = x + y + carry;

		  num = (z % 10) * p + num;
		  carry = z / 10;
		  a = a / 10;
		  b = b / 10;
		  p = p * 10;
	  }
	num = (a + b + carry) * p + num;
	System.out.println ("sum is: " + num);
  }
}
