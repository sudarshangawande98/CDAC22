import java.util.Scanner;

//4. SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE APPROACH.
//-----------------------------------------------------------------------------
class Que4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the two numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		System.out.println("Number Befour swap:  Num1 = " +num1+ " and Num2 = " +num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("Number After  swap:  Num1 = " +num1+ " and Num2 = " +num2);
	}
}
/*
OUTPUT:

Enter the two numbers: 10 20
Number Befour swap:  Num1 = 10 and Num2 = 20
Number After  swap:  Num1 = 20 and Num2 = 10

Enter the two numbers: -25 -15
Number Befour swap:  Num1 = -25 and Num2 = -15
Number After  swap:  Num1 = -15 and Num2 = -25
*/
//-----------------------------------------------------------------------------