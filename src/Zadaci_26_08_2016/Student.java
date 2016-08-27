package Zadaci_26_08_2016;

public class Student extends Person{
	
	
	//data field 
	private final static String[]STATUS= {"freshman", "sophomore", "junior", "senior"};
	
	private String status = STATUS[0];
	
	
	Student(){
		
	}
	
	Student(String name, String adress, String e_mailAdress, String phoneNumber, int status){
		super(name, adress, phoneNumber, e_mailAdress);
		
		this.status = STATUS[status];
	}
	
	//accessors and mutators
public String getStatus(){
	return status;
}

public void setStatus(String status){
	this.status = status;
}
public String toString(){
	
	return "Student" + getName();
}
}
