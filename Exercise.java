public class Exercise
{
  public static void main (String[]args) throws Exception
  {

    char[][] mdArray =
      { {'P', 'R', 'E', 'Y'}, {'L', 'A', 'V', 'A'}, {'O', 'V', 'E', 'R'},
      {'T', 'E', 'N', 'D'} };


    // WORD 1
    System.out.println ("1. WORD 1");
    for (int rows = 0; rows < 4; rows++)
      {


  	for (int column = 0; column < 4; column++)
	    {

	    if (rows == 0)
	      {
		System.out.print (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 2
    System.out.println ("");
    System.out.println ("");
    System.out.println ("2. WORD 2");

    for (int rows = 0; rows < 4; rows++)
      {

	  for (int column = 0; column < 4; column++)
	    {

	    if (rows == 1)
	      {
		System.out.print (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 3
    System.out.println ("");
    System.out.println ("");
    System.out.println ("3. WORD 3");

    for (int rows = 0; rows < 4; rows++)
      {

	  for (int column = 0; column < 4; column++)
	    {

	    if (rows == 2)
	      {
		System.out.print (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 4
    System.out.println ("");
    System.out.println ("");
    System.out.println ("4. WORD 4");

    for (int rows = 0; rows < 4; rows++)
      {

  	for (int column = 0; column < 4; column++)
	    {

	    if (rows == 3)
	      {
		System.out.print (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 5
    System.out.println ("");
    System.out.println ("");
    System.out.println ("5. WORD 5");

    for (int column = 0; column < 4; column++)
      {

	  for (int rows = 0; rows < 4; rows++)
	    {

	    if (column == 0)
	      {
		System.out.println (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 6
    System.out.println ("");
    System.out.println ("6. WORD 6");

    for (int column = 0; column < 4; column++)
      {

  	for (int rows = 0; rows < 4; rows++)
	    {

	    if (column == 1)
	      {
		System.out.println (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 7
    System.out.println ("");
    System.out.println ("7. WORD 7");

    for (int column = 0; column < 4; column++)
      {

  	for (int rows = 0; rows < 4; rows++)
	    {

	    if (column == 2)
	      {
		System.out.println (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }
	  }
      }

    // WORD 8
    System.out.println ("");
    System.out.println ("8. WORD 8");

    for (int column = 0; column < 4; column++)
      {

	  for (int rows = 0; rows < 4; rows++)
	    {

	    if (column == 3)
	      {
		System.out.println (mdArray[rows][column]);
	      }
	    else
	      {
		System.out.print ("");
	      }

	  }
      }

  }

}
