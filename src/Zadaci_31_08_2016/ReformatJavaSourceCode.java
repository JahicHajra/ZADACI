package Zadaci_31_08_2016;
/*(Reformat Java source code) Write a program that converts the Java source
code from the next-line brace style to the end-of-line brace style. For example,
the following Java source in (a) uses the next-line brace style. Your program
converts it to the end-of-line brace style in (b).
 * Your program can be invoked from the command line with the Java source code
file as the argument. It converts the Java source code to a new format. For
example, the following command converts the Java source-code file Test.java
to the end-of-line brace style.
java Exercise12_12 Test.java
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReformatJavaSourceCode {

	public static void main(String[] args) throws IOException{

		//create file
		File f = new File("JavaCode.txt");
		
		//check if file exists
		if(!f.exists()){
			
			System.out.println(" File does not exist.");
		}
		
		else{
			
			String allText = "";
			
			Scanner input = new Scanner(f);
			
			while(input.hasNext()){ // while there is more to read
				
				allText+=input.nextLine()+"\n"; //add to string every next line
				
				
			}
			input.close();
			//replace white spaces tabs and \\{ with {
			allText = allText.replaceAll("\\s*\\{", " {");
			allText = allText.replaceAll("\\)\\s*\\{", ") {");//remove white spaces
			
			//create printwriter object with f string
			PrintWriter pw = new PrintWriter(f);
			
			//add string into the file
			pw.append(allText);
			pw.close();
			
		}
	}

}
