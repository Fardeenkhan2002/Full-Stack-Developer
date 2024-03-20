import java.util.*;
public class SquareOrNot
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter Length: ");
	int l = sc.nextInt ();
	  System.out.print ("Enter Breadth: ");
	int b = sc.nextInt ();

	if (l == b)
	  {
		System.out.print ("It is a square");
	  }
	else
	  {
		System.out.print ("It is not a square");
	  }
  }
}
