package Zadaci_26_08_2016;

public class Staff extends Employee{

	//data fields
	String title;
	
	
	Staff(){
		
	}
	
	//constructor that creates object
	Staff(String name, String phoneNumber, String adress, String e_mailAdress,
			String office, int salary, String title){
		super(name, phoneNumber,adress, e_mailAdress, office, salary);
		
		this.title = title;
	}
//accessors and mutators for data fields
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString(){
		return "Staff" + getName();
	}
}
