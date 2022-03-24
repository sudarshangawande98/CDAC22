import java.util.Scanner;

//2. WRITE A JAVA PROGRAM TO FIND THE FACTORIAL OF GIVEN NUMBER.
//-----------------------------------------------------------------------------
class Que2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		int fact = 1;
			
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.print("Factorial of a number "+num+ " is " +fact);
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the number: 5
Factorial of a number 5 is 120

Enter the number: 1
Factorial of a number 1 is 1

Enter the number: 0
Factorial of a number 0 is 1
*/
//-----------------------------------------------------------------------------