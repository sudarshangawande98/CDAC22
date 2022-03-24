import java.util.Scanner;

//3. FIND THE FACTORIAL OF A NUMBER USING RECURSION.
//-----------------------------------------------------------------------------
class Que3
{
	static int factorial(int num)
	{
		if(num == 0)
			return 1;
		else
			return num * factorial(num-1);
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
			
		System.out.print("Factorial of a number "+num+ " is " +factorial(num));
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