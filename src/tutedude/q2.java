package tutedude;
/*Question 2:
Explain the concept of 'public static void main' in Java. Write a program that demonstrates the execution of a
 simple 'public static void main' method, and explain its components: 'public', 'static', 'void', and 'main'.
Clarifications:
1. Define the 'public static void main' method in your program.
2. Explain the purpose of 'public', 'static', 'void', and 'main' in the method declaration.
3. Implement a simple program that outputs 'Hello, World!' using the main method*/

public class q2 {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println( "PUBLIC :"+"means it is accessable to the jvm from anywhere it can be used"); 
		System.out.println("STATIC:"+ "static means it is accessable without creating the instance of the class"); 
		System.out.println( "VOID :"+"void is used to that have no return in the main function");
		
        

	}
}
