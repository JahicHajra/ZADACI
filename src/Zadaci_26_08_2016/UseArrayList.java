package Zadaci_26_08_2016;
/*(Use ArrayList) Write a program that creates an ArrayList and adds a Loan
object, a Date object, a string, and a Circle object to the list, and use a loop
to display all the elements in the list by invoking the object’s toString()
method.
 * 
 */

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {

		//objects of the classes
		Loan loan = new Loan (2.5);
		Date date = new Date();
		Circle circle = new Circle(7);
		
		// arrayList for objects
		ArrayList <Object> list = new ArrayList<>();
		//add objects to the list
		list.add(loan);
		list.add(date);
		list.add(circle);
		
		//print objects
		for (int i=0; i<list.size(); i++){
			
			System.out.println(list.get(i).toString());
		}
		
		
	}
	
	
}
//Loan class
class Loan{
 
	private double interest;
	
	Loan(){
		
	}
	Loan(double interest){
		this.interest=interest;
	}

	@Override
	public String toString() {
		return "Loan [interest=" + interest + "]";
	}
	
}
//date class
class Date{
	
	private java.util.Date date;
	
	Date(){
		date = new java.util.Date(); 
	}
	public java.util.Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Date [date=" + getDate() + "]";
	}
}

//Circle class
class Circle{
	
	private double radius;
	
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	}
