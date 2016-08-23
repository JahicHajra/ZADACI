package Zadaci_22_08_2016;

/*(Algebra: quadratic equations) Design a class named QuadraticEquation for
a quadratic equation ax2 + bx + x = 0. The class contains:
 Private data fields a, b, and c that represent three coefficients.
 A constructor for the arguments for a, b, and c.
Three getter methods for a, b, and c.
A method named getDiscriminant() that returns the discriminant, which is
b2 - 4ac.
The methods named getRoot1() and getRoot2() for returning two roots of
the equation
r1 = -b + 2b2 - 4ac
2a
and r2 = -b - 2b2 - 4ac
2a
These methods are useful only if the discriminant is nonnegative. Let these methods
return 0 if the discriminant is negative.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display the two roots. If
the discriminant is 0, display the one root. Otherwise, display “The equation has
no roots.”
 * 
 */

public class QuadraticEquations {

	
	//private data fields for three coefficients
	private double a;
	private double b;
	private double c;
	
	//constructor for arguments
	QuadraticEquations(double a, double b, double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
		
		
		
		
	}

//three getter methods for a,b and c
	public double getA() {
		return a;
	}


	public double getB() {
		return b;
	}


	public double getC() {
		return c;
	}

	
	//method getDiscriminant that returns discriminant which is b2-4ac
public double getDiscriminant(){
	
	return (Math.pow(b, 2)-(4 * a * c));
}

//getRoot1 method for returning two roots of equation
public double getRoot1(){
	
	double r1 = 0;
	
	if(getDiscriminant()<0){
		r1 =0;
	}
	
	else{
		
		r1 = ((-1*b)+Math.sqrt(getDiscriminant()))/(2*a);
	}
	return r1;
}

//getRoot2 method
public double getRoot2(){
	
	double r2 = 0;
	
	if(getDiscriminant()<0){
		
		r2 =0;
	}
	else{
		r2 = (-b-(Math.sqrt(getDiscriminant()))/2*a);
	}
	return r2;
}

public String toString(){
	
	
	//if the discriminant is positive dispay two roots
	if(getDiscriminant()>0){
		
		return " Root one: " + getRoot1() + " Root two: " + getRoot2();
	}
	
	
	//otherwise, the equation has no roots
	else if(getDiscriminant()<0){
		
		return " The equation has no roots. ";
	}
	
	
	//if it is 0, display one root
	else{
		return " The equation has one root" + getRoot1();
	}
	}

//test program
public static void main(String[] args){
	
	//create object
	QuadraticEquations quad = new QuadraticEquations(2, 5, 9);
	
	System.out.println(quad.toString());
	
	System.out.println(new QuadraticEquations(-4,7,2).toString());
	
	System.out.println(new QuadraticEquations(-2,1, 4).toString());


}

}
