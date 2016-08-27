package Zadaci_25_08_2016;
/*
 * *(New string split method) The split method in the String class returns an
array of strings consisting of the substrings split by the delimiters. However, the
delimiters are not returned. Implement the following new method that returns
an array of strings consisting of the substrings split by the matching delimiters,
including the matching delimiters.
public static String[] split(String s, String regex)
For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
#, and e in an array of String.
 * 
 */

import java.util.ArrayList;

public class NewStringSplitMethod {
	
	public static void main(String [] args){
	
	String[]s1 = split("ab#12#453", "#");
	
	for(String str:s1){
		System.out.print(str + "");
		
	}
	String[]s2 = split("a?b?gf#e", "[?#]");
	
	for(String str:s2){
		System.out.print(str);
	}
}

public static String[] split(String s, String regex){
	
	
	ArrayList<String>list = new ArrayList<>();
	
	int counter = 0;
	
	String str = "";
	
	//comparing characters of a string with characters of regex
	for(int i = 0; i < s.length();i++){
		
		for(int j = 0; j < regex.length();j++){
			
			if(s.charAt(i)==regex.charAt(j)){
				
				list.add(str);
				
				list.add(Character.toString(regex.charAt(j)));
				
				str = "";
				
				break;
				
			}
			else{
				counter++;
			}
			//if there is no match found,add characters to str
			if(counter == regex.length()){
				str+=s.charAt(i);
			}
		}
	}
	//add to the list the left of a string
	list.add(str);
	
	//convert the array list to string array
	String[] newSplit = new String[list.size()];
	
	for(int i = 0;i< list.size();i++){
		
		newSplit[i]=list.get(i);
	}
	return newSplit;
	
}

}
