import java.util.Scanner;

//11. WRITE A JAVA PROGRAM TO FIND THE SMALLEST OF 3 NUMBERS (A,B,C)
//-----------------------------------------------------------------------------
class Que11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the 3 number: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
			
		if(n1<n2 && n1<n3)
			System.out.print("The smallest amount the numbers "+n1+", "+n2+" and "+n3+" is "+n1);
		else if(n2<n1 && n2<n3)
			System.out.print("The smallest amount the numbers "+n1+", "+n2+" and "+n3+" is "+n2);
		else
			System.out.print("The smallest amount the numbers "+n1+", "+n2+" and "+n3+" is "+n3);
	}
}
//-----------------------------------------------------------------------------
/*
OUTPUT:

Enter the 3 number: 10 20 30
The smallest amount the numbers 10, 20 and 30 is 10
*/
//-----------------------------------------------------------------------------