/*
class pattern
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

/*
class pattern
{
	public static void main(String args[])
	{
		char ch = 'A';
		
		for(int i=1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}

A
B B
C C C
D D D D
E E E E E
*/

/*
class pattern
{
	public static void main(String args[])
	{
		char ch = '*';
		for(int i=1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}

*
* *
* * *
* * * *
* * * * *
*/

/*
class pattern
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

/*
class pattern
{
	public static void main(String args[])
	{
		char ch = 'A';
		for(int i=1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}

A
B B
C C C
D D D D
E E E E E
*/

/*
class pattern
{
	public static void main(String args[])
	{	
		for(int i=1; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int k = 1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

    *
   **
  ***
 ****
*****

*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");	
			}
			for (int j=1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5

*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--)
		{	
			for(int k=1; k <= i; k++)
			{
				System.out.print(" ");
			}
			for (int j=i; j<=5; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
 
 */

/*
class pattern
{
	public static void main(String args[])
	{	
		for (int i=1; i <= 5; i++)
		{	
			char ch= 'A';
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");

			}
			for(int j=1; j <= i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();

		}
	}
}

    A
   A B
  A B C
 A B C D
A B C D E

*/

/*
class pattern
{
	public static void main(String args[])
	{
		char ch='E';
		for (int i=5; i>=1; i--)
		{	
			for(int k=1; k <= i; k++)
			{
				System.out.print(" ");
			}
			for (int j=i; j<=5; j++)
			{
				ch =(char)(j+64);
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
	}
}

     E
    D E
   C D E
  B C D E
 A B C D E
 
 */
 
 /*
class pattern
{
	public static void main(String args[])
	{
		for (int i=1; i<=9; i++)
		{
			if(i%2 != 0)
			{
				for(int k=8; k>=i; k--)
				{
					System.out.print(" ");
				}
			
				for (int j=1; j<=i; j++)
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}

         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 
 */
 
 /*
 class pattern
 {
	 public static void main(String args[])
	 {
		 char ch = 'A';
		 for(int i=1; i<=5; i++)
		 {
			 for(int k=4; k>=i; k--)
			 {
				 System.out.print(" ");
			 }
			 
			 for(int j=1; j<=i; j++)
			 {
				 System.out.print(ch+" ");
			 }
			 ch++;
			 System.out.println();
		 }
	 }
 }
 
     A
   B B
  C C C
 D D D D
E E E E E
*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--)
		{
			for (int j=1; j<=i; j++ )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=5; j>=i; j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=5; i>=1; i--)
		{
			for (int j=5; j>=i; j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/

/*
class pattern
{
	public static void main(String args[])
	{
		int k = 1;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++ )
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			char k = 'A';
			for (int j=5; j>=i; j-- )
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
A B C D E
A B C D
A B C
A B
A
*/
