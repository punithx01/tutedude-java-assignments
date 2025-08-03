package tutedude;
import java.util.*;
/*Question 1:
Write a Java program to demonstrate the usage of return types and arguments. 
Create a method that takes two integers as arguments and returns their sum. 
Then, call this method from the main method and display the result.
Clarifications:
1. Define a method that takes two integer arguments and returns their sum.
2. In the main method, call the method with appropriate arguments and display the returned result.
3. Ensure the correct return type and arguments are used for the method.
*/
public class assignment2 {
	protected static int  sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		//assignment2 a=new assignment2();
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= input.nextInt();
		System.out.println("Enter the second number");
		int b= input.nextInt();
	System.out.println("the sum of the number is "+sum(a,b));
	input.close();
	}
	}

