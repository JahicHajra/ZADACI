package Zadaci_03_09_2016;
/** (Enable Rectangle comparable) 
 * Rewrite the Rectangle class in Listing 13.3 to extend GeometricObject and implement the Comparable interface. 
 * Override the equals method in the Object class. 
 * Two Rectangle objects are equal if their areas are the same. 
 * Draw the UML diagram that involves Rectangle, GeometricObject, and Comparable. 
 * 
 */



public class EnableRectangleComparable {

	public static void main(String[] args) {

		//create two objects
		Rectangle rectangle1 = new Rectangle(4,2);
		Rectangle rectangle2 = new Rectangle(2,6);
		
		//check if they are equal
		if(rectangle1.equals(rectangle2)){
			
			System.out.println(" Areas of rectangles are equal");
		}
		
		//result as a number that compareTo Method returns
		int result = rectangle1.compareTo(rectangle2);
		
		//if result is 1,first object is bigger
		if(result==1){
			System.out.println(rectangle1.toString() + " is bigger");
		}
		//if it is -1, the second object is bigger
		else if(result==-1){
			System.out.println(rectangle2.toString() + " is bigger");
		}
		else{
			System.out.println(" Areas of rectangles are equal");
		}
	}

}
class Rectangle extends GeometricObject implements Comparable<Rectangle>{
	
	//data fields
	private double height;
	private double width;

	//no-arg constructor
public Rectangle(){
	
}

//constructor with two arguments
public Rectangle(double height,double width){
	this.height=height;
	this.width = width;
	
}

public Rectangle(double height, double width, String colour, boolean filled){
	this.height = height;
	this.width = width;
	
	setColour(colour);
	setFilled(filled);
}
//accessors and mutators for data fields
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getArea(){
	return width*height;
}
public double getPerimeter(){
	return 2*(width+height);
}
public String toString(){
	return "Rectangle[ " + width + "," + height + " ] ";
	
}

//compareTo method returns 0, 1 or -1,depending on which object is bigger
public int compareTo(Rectangle object){
	if(this.getArea()>object.getArea())
		return 1;
	
	else if(this.getArea()<object.getArea())
		return -1;
	
	else
		return 0;
	}
public boolean equals(Object object){
	return object instanceof Rectangle && getArea()==((Rectangle)object).getArea();
}
}