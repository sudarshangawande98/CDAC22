import java.util.Scanner;

//12. How to add two numbers without using the arithmetic operators in Java?
//-----------------------------------------------------------------------------
class Que12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the two number for addition: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int sum = num1;
		
		for(int i=1; i<=num2; i++)
		{
			sum++;
		}
		System.out.println("Addition of "+num1+" and "+num2+" is "+sum);		
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the two number for addition: 20 30
Addition of 20 and 30 is 50
*/
//-----------------------------------------------------------------------------