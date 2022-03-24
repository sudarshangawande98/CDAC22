import java.util.Scanner;

//10. WRITE A JAVA PROGRAM TO FIND SUM OF THE DIGITS OF A GIVEN NUMBER.
//-----------------------------------------------------------------------------
class Que10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int sum = 0;
		System.out.print("Sum of the digits of a number "+num+" is: ");
		
		while(num > 0)
		{
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.print(sum);
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter a number: 4356
Sum of the digits of a number 4356 is: 18
*/
//-----------------------------------------------------------------------------