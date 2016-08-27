package Zadaci_26_08_2016;

public class Faculty extends Employee{

	// data fields officeHours and rank
	int officeHours;
	String rank;
	
	//no-arg constructor
	Faculty(){
		
	}
	
	Faculty(String name, String address, String phoneNumber,
			String emailAddress, String office, int salary, int officeHours,
			String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
}
	
	//accessor and mutator for data fields
	public int getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	//method that enables printing
	public String toString(){
		return " Faculty " + getName();
	}

}