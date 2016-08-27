package Zadaci_26_08_2016;

import java.util.Date;

public class GeometricObject {
	
	private String colour = "white";
	
	private boolean filled;
	
	private java.util.Date dateCreated;
	
	//no-arg constructor
	protected GeometricObject(){
		
		dateCreated = new java.util.Date();
	}
	
	//constructor that creates triangle with specified colour and indication whether it is filled or not
protected GeometricObject(String colour, boolean filled){
	
	dateCreated = new Date();
	
	this.colour = colour;
	this.filled = filled;
}
//return colour
public String getColour() {
	return colour;
}
//set new colour
public void setColour(String colour) {
	this.colour = colour;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}
//get date created
public java.util.Date getDateCreated() {
	return dateCreated;
}

//print object
public String toString(){
	
	return " created on:" + dateCreated + "\ncolour: " + colour + "\nIsFilled? " + filled;}
}

