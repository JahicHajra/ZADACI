package Zadaci_03_09_2016;

 

public abstract class GeometricObject {
	
	//data fields
	private String colour = "white";
	
	private boolean isFilled;
	
	private java.util.Date date;

	
	protected GeometricObject(){
		date = new java.util.Date();
	}
	
	protected GeometricObject(String colour, boolean isFilled){
		
		this.colour = colour;
		this.isFilled = isFilled;
	}
//accessors and mutators for data fields
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public void setFilled(boolean isFilled) {
		this.isFilled = isFilled;
	}

	public java.util.Date getDate() {
		return date;
	}
	
	//method that enables printing
public String toString(){
	
	return " created on :" + date + "\nColour is " + colour + " and geometric object is filled " + isFilled;
	
	}
//abstract methods getArea and getPerimeter
public abstract double getArea();


public abstract double getPerimeter();
	
}

