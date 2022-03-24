import java.util.Scanner;

//6. WRITE A JAVA PROGRAM TO FIND WHETHER GIVEN NUMBER IS LEAP YEAR OR NOT?
//-----------------------------------------------------------------------------
class Que6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int year = in.nextInt();
			
		if((year%400 == 0)|| (year%4 == 0 && year%100 != 0))
			System.out.print("The year "+year+ " is a leap year.");
		else
			System.out.print("The year "+year+ " is not a leap year.");
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the number: 2000
The year 2000 is a leap year.

Enter the number: 2021
The year 2021 is not a leap year.
*/
//-----------------------------------------------------------------------------