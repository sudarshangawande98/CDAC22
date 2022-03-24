import java.util.Scanner;

//7. WRITE A JAVA PROGRAM TO PRINT 1 TO 10 WITHOUT USING LOOP.
//-----------------------------------------------------------------------------
class Que7
{
	static void fun(int num)
	{
		if(num <= 10)
		{
			System.out.println(num);
			fun(num+1);
		}
	}
	
	public static void main(String args[])
	{			
		fun(1);
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT: 

1
2
3
4
5
6
7
8
9
10
*/
//-----------------------------------------------------------------------------