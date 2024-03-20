import java.util.*;
public class UpperOrLower
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter an alphabet: ");
	char c = sc.next ().charAt (0);
	if (c >= 'A' && c <= 'Z')
	  {
		System.out.println ("It is a UpperCase");
	  }
	else
	  {
		System.out.println ("It is LowerCase");
	  }
  }
}
