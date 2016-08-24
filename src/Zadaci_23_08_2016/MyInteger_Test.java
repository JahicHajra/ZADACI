package Zadaci_23_08_2016;

/*(The MyInteger class) Design a class named MyInteger. The class contains:
 An int data field named value that stores the int value represented by this
object.
 A constructor that creates a MyInteger object for the specified int value.
 A getter method that returns the int value.
 The methods isEven(), isOdd(), and isPrime() that return true if the
value in this object is even, odd, or prime, respectively.
The static methods isEven(int), isOdd(int), and isPrime(int) that
return true if the specified value is even, odd, or prime, respectively.
 The static methods isEven(MyInteger), isOdd(MyInteger), and
isPrime(MyInteger) that return true if the specified value is even, odd,
or prime, respectively.
 The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
  A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
  A static method parseInt(String) that converts a string into an int
value.
Draw the UML diagram for the class and then implement the class. Write a client
program that tests all methods in the class. 
 * 
 * 
 */



public class MyInteger_Test {

	public static void main(String[] args) {

		//test program that tests all methods in the class
MyInteger m1 = new MyInteger(4);
		
		System.out.println("Object is even " + m1.isEven());
		
		System.out.println(" Number is even " + MyInteger.isEven(13));
		
		System.out.println(" Object is odd " + m1.isOdd());
		
		System.out.println("Number is odd " + MyInteger.isOdd(22));
		
		System.out.println(" Object is prime number " + m1.isPrime());
		
		System.out.println(" Number is prime " + MyInteger.isPrime(17));
		
		System.out.println(" Object is equal to number " + m1.equals(3));
		
		System.out.println(" Object is equal to object" + m1.equals(new MyInteger(6)));
		
		
		char[]ch = {'5', '1', '6'};
		
		System.out.println(MyInteger.parseInt(ch));
		
		System.out.println(MyInteger.parseInt("1234"));
	}
	}


