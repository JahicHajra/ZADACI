package Zadaci_22_08_2016;


/*/*(Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
2 * 2 system of linear equations:
ax + by = e
cx + dy = f
x = ed - bf
ad - bc y = af - ec
ad - bc
The class contains:
Private data fields a, b, c, d, e, and f.
A constructor with the arguments for a, b, c, d, e, and f.
Six getter methods for a, b, c, d, e, and f.
A method named isSolvable() that returns true if ad - bc is not 0.
Methods getX() and getY() that return the solution for the equation.
Draw the UML diagram for the class and then implement the class. Write a test
program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that “The equation has no solution.” 
 * 
 * 
 */

public class LinearEquations {

	//private data fields a,b,c,d,e,f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	
	//constructor with the arguments for a,b,c,d,e,f
	LinearEquations(double a, double b, double c, double d, double e, double f){
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
		}
//getter methods for a,b,c,d,e,f
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}
	
	
	//method isSolvable
	public  boolean isSolvable(){
		
		if((a*d)-(b*c) !=0){
			return true;
		}
		
		//equation has no solution
		return false;
	}
	//method getX that returns the solution for the equation
	public double getX(){
		double x = ((e*d )-(b*f))/((a*d)-(b*c));
		return x;
	}
	
	//method getY(also returns solution for equation
	public double getY(){
		
		double y = ((a*f)-(e*c)/(a*d)-(b*c));
		return y;
	}
	
	//method printResult
	public void printResult(){
		if(isSolvable()==false){
			System.out.println(" The equation has no solution");
		}
		else{
			System.out.println(" Solution x is: " + getX() + "\nSolution for Y is: " + getY());
		}
	}
	//test program
	public static void main(String[] args){
		
		//enter a,b,c,d,e,f and display the result
		LinearEquations lin = new LinearEquations(18, 12, 23, 72, 5, 7);
		lin.printResult();
	}
}
