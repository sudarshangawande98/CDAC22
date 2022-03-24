import java.util.Scanner;

//14. WRITE A JAVA PROGRAM TO FIND GCD OF TWO GIVEN NUMBERS.
//-----------------------------------------------------------------------------
class Que14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the 2 number: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int GCD = 1;
		
		for(int i=1; i<=num1 && i<=num2; i++)
		{
			if(num1%i==0 || num2%i==0)
				GCD = i;
		}
		System.out.print("The GCD of numbers "+num1+" and "+num2+" is "+GCD);		

	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the 2 number: 10 20
The GCD of numbers 10 and 20 is 10
*/
//-----------------------------------------------------------------------------