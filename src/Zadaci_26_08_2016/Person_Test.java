package Zadaci_26_08_2016;
/*
 *  (The Person, Student, Employee, Faculty, and Staff classes) Design a
class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,
address, phone number, and email address. A student has a class status (freshman,
sophomore, junior, or senior). Define the status as a constant. An employee has
an office, salary, and date hired. Use the MyDate class defined in Programming
Exercise 10.14 to create an object for date hired. A faculty member has office
hours and a rank. A staff member has a title. Override the toString method in
each class to display the class name and the person’s name.
Draw the UML diagram for the classes and implement them. Write a test program
that creates a Person, Student, Employee, Faculty, and Staff, and
invokes their toString() methods.
 */

public class Person_Test {

	public static void main(String[] args) {
//Test program
		
		
		//person object
		Person p1 = new Person();
		p1.setName(" Eldin");
		p1.setAdress("Hajdarevac bb");
		System.out.println(p1.toString());
		System.out.println("Adress: " + p1.getAdress());
		System.out.println();
		
		
		//employee object
		Employee e1 = new Employee();
		e1.setName(" Amina");
		e1.setSalary(890);
		System.out.println(e1.toString());
		System.out.println(" Salary " + e1.getSalary());
		System.out.println();
		
		
		//faculty
		Faculty f1 = new Faculty();
		f1.setName(" Amra");
		f1.setOfficeHours(8);
		System.out.println(f1.toString());
		System.out.println(" Office hours: " + f1.getOfficeHours());
		System.out.println();
		
		
		
		//student object
		Student s1 = new Student();
		s1.setName(" Kada");
		s1.setPhoneNumber(" 062/166-517");
		System.out.println(s1.toString());
		System.out.println(" Phone number: " + s1.getPhoneNumber());
		System.out.println();
		
		
		//staff object
		Staff st1 = new Staff();
		st1.setName(" Asmira");
		st1.setTitle(" Manager");
		
		System.out.println(st1.toString());
		System.out.println(" Title :" + st1.getTitle());
		
		
		
		
		
	}

}
