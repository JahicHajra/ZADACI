package Zadaci_25_08_2016;
/*
 * /*(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString1):
public MyString1(char[] chars);
public char charAt(int index);
public int length();
public MyString1 substring(int begin, int end);
public MyString1 toLowerCase();
public boolean equals(MyString1 s);
public static MyString1 valueOf(int i);
 *
 */

public class MyString1_Test {

	public static void main(String[] args) {

		
		//test program

				MyString1 s = new MyString1("guttURal");
				
				//string length
				System.out.println("MyString length " + s.length());
				
				//substring of a string from begin index to end index
				System.out.println("MyString substring " + s.substring(0, 3));
				
				//check if it equals to another string
				System.out.println(s.equals("lateral") ) ;
				
				//return character with the index
				System.out.println(s.charAt(5));
				
				//string to lower case
				System.out.println(s.toLowerCase());

}

}
