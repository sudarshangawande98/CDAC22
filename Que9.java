import java.util.Scanner;

//9. WRITE A JAVA PROGRAM TO PRINT ALL THE FACTORS OF THE GIVEN NUMBER.
//-----------------------------------------------------------------------------
class Que9
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.print("Factors of number "+num+" is: ");
		
		for(int i=1; i<=num; i++)
		{
			if(num%i == 0)
				System.out.print(i+" ");
		}
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT: 

Enter a number: 6
Factors of number 6 is: 1 2 3 6
*/
//-----------------------------------------------------------------------------