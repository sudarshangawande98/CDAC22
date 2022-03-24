import java.util.Scanner;

//-----------------------------------------------------------------------------
//1. CHECK THE GIVEN NUMBER IS EVEN OR ODD.
/*
class assignment1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		
		if(num == 0)
			System.out.print("The number " +num+" is neither even nor odd.");
		else if(num%2==0)
			System.out.print("The number "+num+" is even.");
		else
			System.out.print("The number " +num+" is odd.");
	}
}
*/

/*
OUTPUT:

Enter the number: 12
The number 12 is even.

Enter the number: 13
The number 13 is odd.

Enter the number: 0
The number 0 is neither even nor odd.
*/
//-----------------------------------------------------------------------------
//2. WRITE A JAVA PROGRAM TO FIND THE FACTORIAL OF GIVEN NUMBER.
/*
class assignment1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		int fact = 1;
			
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.print("Factorial of a number "+num+ " is " +fact);
	}
}
*/

/*
OUTPUT:

Enter the number: 5
Factorial of a number 5 is 120

Enter the number: 1
Factorial of a number 1 is 1

Enter the number: 0
Factorial of a number 0 is 1
*/
//-----------------------------------------------------------------------------
//3. FIND THE FACTORIAL OF A NUMBER USING RECURSION.
/*
class assignment1
{
	static int factorial(int num)
	{
		if(num == 0)
			return 1;
		else
			return num * factorial(num-1);
	}
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
			
		System.out.print("Factorial of a number "+num+ " is " +factorial(num));
	}
}
*/

/*
OUTPUT:

Enter the number: 5
Factorial of a number 5 is 120

Enter the number: 1
Factorial of a number 1 is 1

Enter the number: 0
Factorial of a number 0 is 1
*/
//-----------------------------------------------------------------------------
//4. SWAP TWO NUMBERS WITHOUT USING THIRD VARIABLE APPROACH.
/*
class assignment1
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
*/

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
//5. HOW TO CHECK THE GIVEN NUMBER IS POSITIVE OR NEGATIVE IN JAVA?
/*
class assignment1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = in.nextInt();
		
		if(num == 0)
			System.out.print("The number " +num+" is neither positive nor negative.");
		else if(num > 0)
			System.out.print("The number "+num+" is Positive.");
		else
			System.out.print("The number " +num+" is Negative.");
	}
}
*/

/*
OUTPUT:

Enter the number: 12
The number 12 is Positive.

Enter the number: 0
The number 0 is neither positive nor negative.

Enter the number: -8
The number -8 is Negative.
*/
//-----------------------------------------------------------------------------
//6. WRITE A JAVA PROGRAM TO FIND WHETHER GIVEN NUMBER IS LEAP YEAR OR NOT?
/*
class assignment1
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
*/

/*
OUTPUT:

Enter the number: 2000
The year 2000 is a leap year.

Enter the number: 2021
The year 2021 is not a leap year.
*/
//-----------------------------------------------------------------------------
//7. WRITE A JAVA PROGRAM TO PRINT 1 TO 10 WITHOUT USING LOOP.
/*
class assignment1
{
	static void fun(int num)
	{
		if(num <= 10)
		{
			System.out.println(num);
			fun(num+1);
		}
	}
	
	public static void main(String args[])
	{			
		fun(1);
	}
}
*/

/*
OUTPUT:

1
2
3
4
5
6
7
8
9
10
*/
//-----------------------------------------------------------------------------
//8. WRITE A JAVA PROGRAM TO PRINT THE DIGITS OF A GIVEN NUMBER.
/*
class assignment1
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
*/

/*
OUTPUT:

Enter the number: 4567
Number on 4 position is 7
Number on 3 position is 6
Number on 2 position is 5
Number on 1 position is 4
*/
//-----------------------------------------------------------------------------
//9. WRITE A JAVA PROGRAM TO PRINT ALL THE FACTORS OF THE GIVEN NUMBER.
/*
class assignment1
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
*/

/*
OUTPUT:

Enter a number: 6
Factors of number 6 is: 1 2 3 6
*/
//-----------------------------------------------------------------------------
//10. WRITE A JAVA PROGRAM TO FIND SUM OF THE DIGITS OF A GIVEN NUMBER.
/*
class assignment1
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
*/

/*
OUTPUT:

Enter a number: 4356
Sum of the digits of a number 4356 is: 18
*/
//-----------------------------------------------------------------------------
//11. WRITE A JAVA PROGRAM TO FIND THE SMALLEST OF 3 NUMBERS (A,B,C)
/*
class assignment1
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
*/

/*
Enter the 3 number: 10 20 30
The smallest amount the numbers 10, 20 and 30 is 10
*/
//-----------------------------------------------------------------------------
//12. How to add two numbers without using the arithmetic operators in Java?
/*
class assignment1
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
*/

/*
Enter the two number for addition: 20 30
Addition of 20 and 30 is 50
*/
//-----------------------------------------------------------------------------
//13. WRITE A JAVA PROGRAM TO REVERSE A GIVEN NUMBER.
/*
class assignment1
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
*/

/*
Enter the number: 1234
The reverse of number 1234 is 4321
*/
//-----------------------------------------------------------------------------
//14. WRITE A JAVA PROGRAM TO FIND GCD OF TWO GIVEN NUMBERS.
/*
class assignment1
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
*/

/*
Enter the 2 number: 10 20
The GCD of numbers 10 and 20 is 10
*/
//-----------------------------------------------------------------------------
//17. Check whether the Given Number is a Palindrome or NOT.
/*
class assignment1
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
*/

/*
OUTPUT:

Enter the number: 123321
The number 123321 is palindrome.

Enter the number: 123
The number 123 is not a palindrome.
*/
//-----------------------------------------------------------------------------


