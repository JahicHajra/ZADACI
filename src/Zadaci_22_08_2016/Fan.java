package Zadaci_22_08_2016;

public class Fan {

	//three constants to denote the fan speed
    final int SLOW;
	
	final int MEDIUM;
	
	final int FAST;
	
	
	//private data fields
	private int speed;
	private double radius;
	private String colour;
	private boolean on;
	
	
	//no-arg constructor
	Fan(){
	
		SLOW = 1;
		MEDIUM = 3;
		FAST = 5;
		
		speed = SLOW;
		radius = 5;
		colour = "blue";
		
		
	}

	//accessor and mutator methods for all four data fields
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}
	
	
	//toString method that returns string description for the fan
	public String toString(){
		
		if(on==true){
			
			return " Fan is on.\nFan speed " + speed+ "\nFan colour " + colour + "\nFan radius " + radius;
		}
		
		else{
			
			return "\nFan is off.\nFan speed " + speed + "\nFan colour " + colour + "\nFan radius " + radius;
		}
		
	}
		
	
}
