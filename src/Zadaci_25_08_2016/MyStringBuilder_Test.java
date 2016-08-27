package Zadaci_25_08_2016;
/*/*(Implement the StringBuilder class) The StringBuilder class is provided
in the Java library. Provide your own implementation for the following methods
(name the new class MyStringBuilder1):
public MyStringBuilder1(String s);
public MyStringBuilder1 append(MyStringBuilder1 s);
public MyStringBuilder1 append(int i);
public int length();
public char charAt(int index);
public MyStringBuilder1 toLowerCase();
public MyStringBuilder1 substring(int begin, int end);
public String toString()
 * 
 * 
 */

public class MyStringBuilder_Test {

	public static void main(String[] args) {

		
		MyStringBuilder s1 = new MyStringBuilder("LOOse CaNNoN");
		MyStringBuilder s2 = new MyStringBuilder("PerPENDicular");
		
		
		// method that appends two strings
		System.out.println(s1.append(s2));
		
		
		// method that appends string and int
		System.out.println(s1.append(3));
		
		// method that returns length of the object
		System.out.println(s1.length());
		
		// method that returns char at given index
		System.out.println(s1.charAt(8));
		
		// method that converts string to lower case
		System.out.println(s1.toLowerCase());
		
		// method that returns substring of previous string
		System.out.println(s1.substring(4, 9));

	

	}

}
