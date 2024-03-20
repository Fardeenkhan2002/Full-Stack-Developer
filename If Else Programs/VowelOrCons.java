import java.util.*;
public class VowelOrCons
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	  System.out.print ("Enter an alphabet: ");
	char c = sc.next ().charAt (0);
	if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'
		|| c == 'E' || c == 'O' || c == 'I' || c == 'U')
	  {
		System.out.println ("It is a vowel");
	  }
	else
	  {
		System.out.println ("It is a Consonant");
	  }
  }
}
