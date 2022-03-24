import java.util.Scanner;

//1. CHECK THE GIVEN NUMBER IS EVEN OR ODD.
//-----------------------------------------------------------------------------
class Que1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		
		if(num == 0)
			System.out.print("The number " +num+" is neither even nor odd.");
		else if(num%2==0)
			System.out.print("The number "+num+" is even.");
		else
			System.out.print("The number " +num+" is odd.");
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the number: 12
The number 12 is even.

Enter the number: 13
The number 13 is odd.

Enter the number: 0
The number 0 is neither even nor odd.
*/
//-----------------------------------------------------------------------------
