package Zadaci_26_08_2016;
import java.util.Date;
public class Employee extends Person {
	
	
	//data fields
	String office;
	int salary;
	Date dateHired;
	

	//no-arg constructor
Employee(){
	
}
//constructor that creates employee object with specified name,phone number...
Employee(String name, String phoneNumber, String adress, String e_mailAdress,
		String office, int salary){
	super(name, phoneNumber, adress, e_mailAdress);
	
	this.office=office;
	this.salary = salary;
	this.dateHired = new Date();
}

//accessors and mutators for data fields
public String getOffice() {
	return office;
}
public void setOffice(String office) {
	this.office = office;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Date getDateHired() {
	return dateHired;
}
public void setDateHired(Date dateHired) {
	this.dateHired = dateHired;
}

//method that enables printing
public String toString(){
	return "Employee" + getName();
}
}
