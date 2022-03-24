import java.util.Scanner;

/*
1.Write a Java program to print 'Hello' on screen and then print your name on a separate line.
Expected Output :
Hello
Alexandra Abramov
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		System.out.println("Hello");
		System.out.println("Alexandra Abramov");
	}
}
*/

/*
Hello
Alexandra Abramov
*/
//----------------------------------------------------------------------
/*
2. Write a Java program to print the sum of two numbers.
Test Data: 74 + 36
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		System.out.println(74 + 36);
	}
}
*/

/*
110
*/
//----------------------------------------------------------------------
/*
3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		System.out.println(50/3);
	}
}
*/

/*
16
*/
//----------------------------------------------------------------------
/*
4. Write a Java program to print the result of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}
}
*/

/*
43
1
19
13
*/
//----------------------------------------------------------------------
/*
5. Write a Java program that takes two numbers as input and display the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");	
		int n1 = in.nextInt();
		
		System.out.print("Input second number: ");	
		int n2 = in.nextInt();
		
		int mul = n1 * n2;
		System.out.println(n1+ " X " +n2+ " = " +mul);	
	}
}
*/

/*
Input first number: 25
Input second number: 5
25 X 5 = 125
*/
//----------------------------------------------------------------------

/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");	
		int n1 = in.nextInt();
		
		System.out.print("Input second number: ");	
		int n2 = in.nextInt();
		
		int sum = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		int mod = n1 % n2;

		System.out.println(n1+ " + " +n2+ " = " +sum);	
		System.out.println(n1+ " - " +n2+ " = " +sub);	
		System.out.println(n1+ " x " +n2+ " = " +mul);	
		System.out.println(n1+ " / " +n2+ " = " +div);	
		System.out.println(n1+ " mod " +n2+ " = " +mod);	
	}
}
*/

/*
Input first number: 125
Input second number: 24
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/
//----------------------------------------------------------------------
/*
7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input first number: ");	
		int n = in.nextInt();

		for(int i=1; i<=10; i++)
		{
			System.out.println(n+ " * " +i+ " = " +(n*i));	
		}
	}
}
*/

/*
Input first number: 8
8 * 1 = 8
8 * 2 = 16
8 * 3 = 24
8 * 4 = 32
8 * 5 = 40
8 * 6 = 48
8 * 7 = 56
8 * 8 = 64
8 * 9 = 72
8 * 10 = 80
*/
//----------------------------------------------------------------------
/*
8. Write a Java program to display the following pattern.
Sample Pattern :
*/

/*
class assignment2
{ 
	public static void main(String args[])
	{ 
		System.out.println("   j    a   v     v   a");	
		System.out.println("   j   a a   v   v   a a");	
		System.out.println("j  j  aaaaa   V V   aaaaa");	
		System.out.println(" jj  a     a   V   a     a");	
	}
}
*/

/*

   j    a   v     v   a
   j   a a   v   v   a a
j  j  aaaaa   V V   aaaaa
 jj  a     a   V   a     a
 
*/
//----------------------------------------------------------------------
/*
9. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		double num = ((25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));
		System.out.println(num);
	}
}

*/

/*
2.138888888888889
*/
//----------------------------------------------------------------------
/*
10. Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		double num = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.print(num);
	}
}
*/

/*
2.9760461760461765
*/
//----------------------------------------------------------------------
/*
11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

/*
class assignment2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Radius = ");	
		double r = in.nextDouble();
		
		System.out.println("Perimeter is = "+(2 * Math.PI * r));	
		System.out.println("Area is = "+(Math.PI * r * r));	
	}
}
*/

/*
Radius = 7.5
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
//----------------------------------------------------------------------
//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

/*
class assignment2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three number: ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		System.out.print("Average of " +n1+ " , " +n2+ " and " +n3+ " is " +((n1 + n2 + n3)/3));
	}
}
*/

/*
Enter three number: 10 20 30
Average of 10,20 and 30 is 20
*/
//----------------------------------------------------------------------
/*
13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.6 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

class assignment2
{
	public static void main(String args[])
	{
		final double Width = 5.6;
		final double Height = 8.5;
		
		System.out.println("Area is "+Width+ " * " +8.5+ " = " +(Width * Height));	
		System.out.println("Perimeter is " +2+ " * (" +Width+ " + " +Height+ ") = " +(2 * (Width + Height)));	
	}
}