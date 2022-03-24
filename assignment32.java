/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=i; j++ )
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
		for (int i=5; i>=1; i--)
		{
			for (int j=1; j<=i; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

*****
****
***
**
*

*/

/*
class pattern
{
	public static void main(String args[])
	{
		for (int i=1; i<=5; i++)
		{
			for(int k=1; k<=i; k++)
			{
				System.out.print(" ");
			}
			
			for (int j=5; j>=i; j-- )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

 *****
  ****
   ***
    **
     *

*/

/*
class pattern2
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
			
				for (int j=1; j<=i; j++ )
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
 class pattern2
{
	public static void main(String args[])
	{
		for (int i=9; i>=1; i--)
		{
			if(i%2 != 0)
			{
				for(int k=8; k>=i; k--)
				{
					System.out.print(" ");
				}
			
				for (int j=1; j<=i; j++ )
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
*/

/*
class pattern2
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
			
				for (int j=i; j<=2*i-1; j++ )
				{
					System.out.print(" *");
				}
				System.out.println();
			}
		}
		
		for (int l=8; l>=1; l--)
		{
			if(l%2 != 0)
			{
				for(int m=8; m>=l; m--)
				{
					System.out.print(" ");
				}
			
				for (int n=l; n<=2*l-1; n++ )
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
   * * * * * * *
     * * * * *
       * * *
         *
		 
*/

/*
class pattern2
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
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
****
***
**
*

*/

/*
class pattern2
{
	public static void main(String args[])
	{	
		for(int i=5; i>=1; i--)
		{	
			for(int k=i; k>=1; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=i; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
		for(int i=1; i<=4; i++)
		{
			for(int k=i; k>=0; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=4; j>=i; j--)
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
  ****
   ***
    **
     *
*/

/*
class pattern2
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}

    *****
   *****
  *****
 *****
*****

*/

/*
class pattern2
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int k=2; k<=i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}

*****
 *****
  *****
   *****
    *****
*/

/*
class pattern2
{
	public static void main(String args[])
	{
		for(int i=5; i>=2; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}

*****
****
***
**
*
**
***
****
*****

*/

/*
class pattern2
{
	public static void main(String args[])
	{
		for(int i=5; i>=2; i--)
		{
			for(int k=4; k>=i; k--)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++)
		{
			for(int k=i+1; k<=5; k++)
			{
				System.out.print(" ");
				
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}	
}

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****

*/

/*
class pattern2
{
	public static void main(String args[])
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=2; i<=5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}

 * * * * *
  * * * *
   * * *
    * *
     *
    * *
   * * *
  * * * *
 * * * * *
 
 */
 
class pattern2
{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j==3 || j==4)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

