import java.util.Scanner;

//17. Check whether the Given Number is a Palindrome or NOT.
//-----------------------------------------------------------------------------
class Que17
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		int temp = num;
		int reverse = 0;

		while(num!=0)
		{
			int rem = num%10;
			reverse = reverse *10 + rem;
			num = num/10;
		}
		
		if(reverse == temp)
			System.out.print("The number "+temp+ " is palindrome.");	
		else
			System.out.print("The number "+temp+ " is not a palindrome.");	
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the number: 123321
The number 123321 is palindrome.

Enter the number: 123
The number 123 is not a palindrome.
*/
//-----------------------------------------------------------------------------