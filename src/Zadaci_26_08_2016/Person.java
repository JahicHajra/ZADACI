package Zadaci_26_08_2016;

public class Person {

	//data fields
	String name;
	String phoneNumber;
	String adress;
	String e_mailAdress;

	//no-arg constructor
Person(){
	
}
	//constructor that creates person object with specified name,adress...
Person(String name,String phoneNumber, String adress, String e_mailAdress){
	
	this.name = name;
	this.phoneNumber= phoneNumber;
	this.adress = adress;
	this.e_mailAdress = e_mailAdress;
}

//accessors and mutators for data fields
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAdress() {
	return adress;
}

public void setAdress(String adress) {
	this.adress = adress;
}

public String getE_mailAdress() {
	return e_mailAdress;
}

public void setE_mailAdress(String e_mailAdress) {
	this.e_mailAdress = e_mailAdress;
}
public String toString(){
	return "Person" + getName();
}
}