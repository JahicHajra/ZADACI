package Zadaci_22_08_2016;


/*
 *  (The Fan class) Design a class named Fan to represent a fan. The class contains:
		 Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
		denote the fan speed.
		A private int data field named speed that specifies the speed of the fan (the
		default is SLOW).
		 A private boolean data field named on that specifies whether the fan is on (the
		default is false).
		A private double data field named radius that specifies the radius of the fan
		(the default is 5).
		A string data field named colour that specifies the colour of the fan (the default
		is blue).
		The accessor and mutator methods for all four data fields.
		A no-arg constructor that creates a default fan.
		A method named toString() that returns a string description for the fan. If
		the fan is on, the method returns the fan speed, colour, and radius in one combined
		string. If the fan is not on, the method returns the fan colour and radius
		along with the string “fan is off” in one combined string.
		Draw the UML diagram for the class and then implement the class. Write a test
		program that creates two Fan objects. Assign maximum speed, radius 10, colour
		yellow, and turn it on to the first object. Assign medium speed, radius 5, colour
		blue, and turn it off to the second object. Display the objects by invoking their
		toString method.
		 * 
 */


		public class Fan_Test {

			public static void main(String[] args) {

				//create two objects
				Fan fan1 = new Fan();
				Fan fan2 = new Fan();
					
				
			//assign maximum speed,radius 10 ,colour yellow and status on for the first object
					fan1.setSpeed(fan1.FAST);
					fan1.setRadius(10);
					fan1.setColour("Yellow");
					fan1.setOn(true);
					
					
			//assign medium speed, radius 5,colour blue and status off for the second object
					fan2.setSpeed(fan2.MEDIUM);
					fan2.setRadius(5);
					fan2.setColour("blue");
					fan2.setOn(false);
					
					
					
					
				//display the objects by invoking toString method
				System.out.println(fan1.toString());
				System.out.println(fan2.toString());
				
			}}
