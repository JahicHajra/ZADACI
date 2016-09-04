package Zadaci_03_09_2016;

/*(Enable the Course class cloneable) 
 *  Rewrite the Course class in Listing 10.6 to add a clone method to 
 *  perform a deep copy on the students field.
 * 
 */

public class EnableTheCourseClassCloneable {

public static void main(String[] args) throws CloneNotSupportedException {
		
	//create object
		Course course1 = new Course("English");
		
		//add students
		course1.addStudent(" Eldin ");
		course1.addStudent(" Amina ");
		course1.addStudent(" Asmir ");
		
		//copy course1
		Course course2  = (Course)course1.clone();
		System.out.println("Course 1 has "+course1.getNumberOfStudents() + " students" );
		System.out.println("Course 2 has "+course2.getNumberOfStudents()+ " students");
		
		//add new student to the course
		course2.addStudent(" Deni ");	
		System.out.println("\nCourse 1 has "+course1.getNumberOfStudents() + " students" );
		System.out.println("Course 2 has "+course2.getNumberOfStudents()+ " students");
		
	}
}
class Course implements Cloneable{
	
	//data fields
	private String courseName; 
	private String[] students = new String[100]; 
	private int numberOfStudents; 
	
	
	public Course(String courseName) { 
		this.courseName = courseName; 
		} 
	
	public void addStudent(String student) { 
		students[numberOfStudents] = student; 
		numberOfStudents++; 
		} 
	//set accessors for data fields
	public String[] getStudents() { 
		return students; 
		} 
	
	public int getNumberOfStudents() { 
		return numberOfStudents; 
		} 
	
	public String getCourseName() { 
		return courseName; 
		} 
	
	public void dropStudent(String student) { 
		 
		}
	
	 @Override
	  protected Object clone() throws CloneNotSupportedException  {
	       
		 	Course course2 = null;						
		 	
		 	//superClone
	        course2 = (Course) super.clone();			
	        
	        //copy students
	        course2.students= students.clone();			
	        
	        return course2;
	    }
	
}
