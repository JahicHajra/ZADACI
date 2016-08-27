package Zadaci_26_08_2016;

/*(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:
Three double data fields named side1, side2, and side3 with default
values 1.0 to denote three sides of the triangle.
 A no-arg constructor that creates a default triangle.
A constructor that creates a triangle with the specified side1, side2, and
side3.
The accessor methods for all three data fields.
A method named getArea() that returns the area of this triangle.
 A method named getPerimeter() that returns the perimeter of this triangle.
A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Programming Exercise 2.19.
The toString() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not
 * 
 * 
 */
import java.util.Scanner;
public class Triangle_Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter three sides of a triangle");
		
		//create an array 
		double[]side = new double[3];
		
		//array input by user
		for(int i = 0;i < side.length;i++){
			
			side[i]=input.nextDouble();
		}

		//
		System.out.println(" Enter true if triangle is filled and false if it is not ");
		
		//user input
		String filledTriangle = input.next();
		
		boolean isFilled = (filledTriangle.equals("true"));
		
		System.out.println("Enter a colour of a triangle");
		//user input
		String colour = input.next();
		
		//create object
		Triangle t1 = new Triangle(side[0],side[1],side[2]);
		//set colour and isFilled status
		t1.setColour(colour);
		t1.setFilled(true);
		//print area,parameter, colour and filled
		System.out.println("Triangle t1");
		System.out.println("Area: " + t1.getArea());
		System.out.println("Perimeter: " + t1.getPerimeter());
		System.out.println("Colour:" + t1.getColour());
		System.out.println("Is filled? " + t1.isFilled());
		
	}

}
