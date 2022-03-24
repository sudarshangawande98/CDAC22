import java.util.Scanner;

//5. HOW TO CHECK THE GIVEN NUMBER IS POSITIVE OR NEGATIVE IN JAVA?
//-----------------------------------------------------------------------------
class Que5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		
		if(num == 0)
			System.out.print("The number " +num+" is neither positive nor negative.");
		else if(num > 0)
			System.out.print("The number "+num+" is Positive.");
		else
			System.out.print("The number " +num+" is Negative.");
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the number: 12
The number 12 is Positive.

Enter the number: 0
The number 0 is neither positive nor negative.

Enter the number: -8
The number -8 is Negative.
*/
//-----------------------------------------------------------------------------