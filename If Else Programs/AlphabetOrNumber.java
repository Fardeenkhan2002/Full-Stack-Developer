import java.util.*;
public class AlphabetOrNumber
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter a Character: ");
	char c = sc.next ().charAt (0);
	if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
	  {
		System.out.println ("It is a Alphabet");
	  }
	else if (c >= '0' && c <= '9')
	  {
		System.out.println ("It is a Number");
	  }
	else
	  {
		System.out.println ("It is any other symbol");
	  }
  }
}
