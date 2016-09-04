package Zadaci_03_09_2016;
/*
 * (Enable Circle comparable) 
 * Rewrite the Circle class in Listing 13.2 to extend GeometricObject and implement the Comparable interface. 
 * Override the equals method in the Object class. 
 * Two Circle objects are equal if their radii are the same. 
 * Draw the UML diagram that involves Circle, GeometricObject, and Comparable. 
 */
 


public class EnableCircleComparable {

	public static void main(String[] args) {

		//create two objects
		Circle circle1 = new Circle(4);
		
		Circle circle2 = new Circle(5);
		
		//check if the first object equals the second
		if(circle1.equals(circle2)){
			
			System.out.println(" Circles' radii are equal");
		}
		//number as a result of compareTo method
		int number = circle1.compareTo(circle2);
		
		//if number is 1,circle1 is bigger than circle2
		if(number==1){
			
			System.out.println(circle1.toString() + " is bigger");
		}
		
		//if number is -1 circle2 is bigger than circle1
		else if(number==-1){
			
			System.out.println(circle2.toString()+ " is bigger");
		}
		else{
			System.out.println(" The area of circles are equal");
		}
	}

}

class Circle extends GeometricObject implements Comparable<Circle>{
	
	//data field
	private double radius;
	
	public Circle(){
		
	}
	
	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(double radius, String colour, boolean isFilled){
		
		this.radius = radius;
		setColour(colour);
		setFilled(isFilled);
	}
	//asseccor and mutator for radius
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//compute area
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	//compute diametar
	public double getDiameter(){
		
		return 2*radius;
	}
	//compute perimeter
	public double getPerimeter(){
		return 2*radius*Math.PI;
	}
	
	//method that enables printing
	public String toString(){
		
		return " Circle with radius of " + this.radius;
	}
	public int compareTo(Circle object){
		
		//return 1,-1 or 0,depending on which circle is greater
		if(this.getArea()>object.getArea())
			return 1;
		
		else if(this.getArea()<object.getArea())
			return -1;
			
			else
				return 0;
			}
			
		
		public boolean equals(Object object){
			return object instanceof Circle && radius ==((Circle) object).radius;
		}
	}
