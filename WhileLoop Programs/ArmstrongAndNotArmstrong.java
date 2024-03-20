import java.util.*;
public class ArmstrongAndNotArmstrong
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter the Number : ");
	int n = sc.nextInt ();
	int t = n;
	int lin = 0;

	while (t > 0)
	  {
		lin++;
		t = t / 10;
	  }
	double sum = 0;
	t = n;
	while (t > 0)
	  {
		int r = t % 10;
		sum = sum + Math.pow (r, lin);
		t = t / 10;
	  }
	if (n == sum)
	  {
		System.out.print ("Armstrong");
	  }
	else
	  {
		System.out.print ("not Armstrong");
	  }
  }
}
