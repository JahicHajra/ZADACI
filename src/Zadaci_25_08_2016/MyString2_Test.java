package Zadaci_25_08_2016;
/*/*(Implement the String class) The String class is provided in the Java library.
Provide your own implementation for the following methods (name the new
class MyString2):
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
 * 
 */

public class MyString2_Test {

	public static void main(String[] args) {

MyString2 ms = new MyString2("Yet,something goes wrong");
		

//compare ms to another string
		System.out.println(ms.compare("Extraordinary"));
		
		//get the substring starting from 4 index
		System.out.println(ms.substring(4));
		
		//get the new substring in upper case letters
		System.out.println(ms.toUppercase());
		//returns value of boolean variable
		boolean t = true;
		System.out.println(MyString2.valueOf(t));
		}
	}

