import java.util.*;
public class TicTacGame
{
  static int n = 13;

  static char a1 = '1', a2 = '2', a3 = '3', a4 = '4', a5 = '5', a6 = '6', a7 =
	'7', a8 = '8', a9 = '9';
  public static void print ()
  {
	for (int i = 1; i <= n; i++)
	  {
		for (int j = 1; j <= n; j++)
		  {
			if (i == 5 || i == 9 || j == 5 || j == 9)
			  {
				System.out.print ("* ");
			  }
			else if (i == 3 && j == 3)
			  {
				System.out.print (a1 + " ");
			  }
			else if (i == 3 && j == 7)
			  {
				System.out.print (a2 + " ");
			  }
			else if (i == 3 && j == 11)
			  {
				System.out.print (a3 + " ");
			  }
			else if (i == 7 && j == 3)
			  {
				System.out.print (a4 + " ");
			  }
			else if (i == 7 && j == 7)
			  {
				System.out.print (a5 + " ");
			  }
			else if (i == 7 && j == 11)
			  {
				System.out.print (a6 + " ");
			  }
			else if (i == 11 && j == 3)
			  {
				System.out.print (a7 + " ");
			  }
			else if (i == 11 && j == 7)
			  {
				System.out.print (a8 + " ");
			  }
			else if (i == 11 && j == 11)
			  {
				System.out.print (a9 + " ");
			  }
			else
			  {
				System.out.print ("  ");

			  }
		  }

		System.out.println ();
	  }
  }

  public static void update (char c, int x)
  {
	switch (x)
	  {
	  case 1:
		a1 = c;
		break;
	  case 2:
		a2 = c;
		break;
	  case 3:
		a3 = c;
		break;
	  case 4:
		a4 = c;
		break;
	  case 5:
		a5 = c;
		break;
	  case 6:
		a6 = c;
		break;
	  case 7:
		a7 = c;
		break;
	  case 8:
		a8 = c;
		break;
	  case 9:
		a9 = c;
		break;
	  }
  }
  public static int isWon ()
  {
	if (a1 == a2 && a2 == a3)
	  {
		return 1;
	  }
	else if (a4 == a5 && a5 == a6)
	  {
		return 1;
	  }
	else if (a7 == a8 && a8 == a9)
	  {
		return 1;

	  }
	else if (a1 == a4 && a4 == a7)
	  {
		return 1;

	  }
	else if (a2 == a5 && a5 == a8)
	  {
		return 1;

	  }
	else if (a3 == a6 && a6 == a9)
	  {
		return 1;

	  }
	else if (a1 == a5 && a5 == a9)
	  {
		return 1;

	  }
	else if (a3 == a5 && a5 == a7)
	  {
		return 1;
	  }
	else
	  {
		return 0;
	  }


  }
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int z = 0, i = 0;
	for (i = 1; i <= 9; i++)
	  {
		// clearScreen()
		System.out.print ("\033[H\033[2J");
		System.out.flush ();

		print ();
		char c;

		if (i % 2 == 0)
		  {
			System.out.println ("2nd Player Turn ");
			c = 'O';
		  }
		else
		  {
			System.out.println ("1st Player Turn ");
			c = 'X';
		  }
		System.out.print ("your choice ");
		int x = sc.nextInt ();
		update (c, x);

		z = isWon ();
		if (z == 1)
		  {
			break;
		  }


	  }
	System.out.print ("\033[H\033[2J");
	System.out.flush ();

	print ();
	if (z == 0)
	  {
		System.out.print ("Its Draw Match");

	  }
	else
	  {
		if (i % 2 == 0)
		  {
			System.out.print ("Player 2nd Won ");
		  }
		else
		  {
			System.out.print ("Player 1st Won");
		  }
	  }
  }

}
