import java.util.*;
public class Grade
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter marks: ");
	int n = sc.nextInt ();
	if (n > 90)
	  {
		System.out.println ("A Grade ");
	  }
	else if (n > 80)
	  {
		System.out.println ("B Grade");
	  }
	else if (n > 70)
	  {
		System.out.println ("C Grade");
	  }
	else if (n > 60)
	  {
		System.out.println ("D Grade");
	  }
	else if (n > 50)
	  {
		System.out.println ("E Grade");
	  }
	else
	  {
		System.out.println ("Fail");
	  }
  }
}
