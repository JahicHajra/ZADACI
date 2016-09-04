package Zadaci_03_09_2016;
/** (The Octagon class) 
 * Write a class named Octagon that extends GeometricObject and implements the Comparable and Cloneable interfaces. 
 * Assume that all eight sides of the octagon are of equal length. 
 * The area can be computed using the following formula: 
 * area = (2 + 4/22)* side * side  
 * Draw the UML diagram that involves Octagon, GeometricObject, Comparable, and Cloneable. 
 * Write a test program that creates an Octagon object with side value 5 and displays its area and perimeter. 
 * Create a new object using the clone method and compare the two objects using the compareTo method. 
 */
 

public class OctagonTest {
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		//create object
		Octagon octagon1 = new Octagon(7);
		
		//print area and perimeter of the first object
		System.out.println(octagon1.toString());
		System.out.println("Area: "+ octagon1.getArea());
		System.out.println("Perimeter: "+ octagon1.getPerimeter());

		//cloning the first object into second one
		Octagon octagon2= (Octagon)octagon1.clone();
		
		System.out.println("\nClonable object: "+ octagon2.toString());
		
		//check if octagons are equal
		if (octagon1.compareTo(octagon2)== 0){
			System.out.println("The octagons are equal");
		}
		else{
			System.out.println("Not equal.");
		}
}
}
