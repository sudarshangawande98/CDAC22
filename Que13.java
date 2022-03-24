import java.util.Scanner;

//13. WRITE A JAVA PROGRAM TO REVERSE A GIVEN NUMBER.
//-----------------------------------------------------------------------------
class Que13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		System.out.print("The reverse of number "+num+" is ");
		
		while(num > 0)
		{
			int rem = num%10;
			System.out.print(rem);
			num = num/10;
		}
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the number: 1234
The reverse of number 1234 is 4321
*/
//-----------------------------------------------------------------------------