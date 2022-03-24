import java.util.Scanner;

//8. WRITE A JAVA PROGRAM TO PRINT THE DIGITS OF A GIVEN NUMBER.
//-----------------------------------------------------------------------------
class Que8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		int count = 0;	
		int temp = num;
		
		while(temp > 0)
		{
			temp = temp/10;
			count++;
		}
		
		while(num>0)
		{
			int rem = num%10;
			num = num/10;
			System.out.println("Number on "+count+" position is "+rem);
			count--;
		}
	}	
}
//-----------------------------------------------------------------------------
/*
Enter the number: 4567
Number on 4 position is 7
Number on 3 position is 6
Number on 2 position is 5
Number on 1 position is 4
*/
//-----------------------------------------------------------------------------