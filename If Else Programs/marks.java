// package conditionls;
import java.util.Scanner;
public class marks
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.println ("Enter the marks");
	int n = sc.nextInt ();

	if (n >= 81)
	    System.out.println ("Very Good");
	if (n >= 61 && n <= 80)
	    System.out.println ("Good");
	if (n >= 41 && n <= 60)
	    System.out.println ("Average");
	if (n <= 40)
	    System.out.println ("Fail");
  }

}
