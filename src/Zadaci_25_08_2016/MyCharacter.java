package Zadaci_25_08_2016;

public class MyCharacter {

	
char ch;
	
	//no arg constructor
	public MyCharacter(){
		
	}
	//constructor with char argument
	public MyCharacter(char value){
		this.ch= value;
	}
	
	public boolean isLowerCase(){
		
		//checks if the character is lower case letter
			if((this.ch >= 'a') && (this.ch <= 'z')){
			
				return true;
			}
			else{
				return false;
			}
			
		}

	public boolean isUpperCase(){
		
		//checks if the character is upper case letter
			if((this.ch >= 'A') && (this.ch <= 'Z')){
				return true;
			}
			else{
				return false;
			}
		}
	
	
	public boolean isLetter(){
		
		//checks if the character is letter
		if ((this.ch >= 'A') && (this.ch <= 'Z') || (this.ch >= 'a') && (this.ch <= 'z') ){
			return true;
		}
		else{
			return false;
		}	
	}
	

	public boolean isDigit(){
		//if it is a number btw 0-9,returns true
		if ((this.ch >= '0') && (this.ch <= '9')){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	//checks if the character is digit
	public static boolean isDigit(char ch){
		if ((ch >= '0') && (ch <= '9')){
			return true;
		}
		else{
			return false;
		}
	}
	
	//checks if the character is lower case letter
	public static boolean isLowerCase(char ch){
		if((ch >= 'a') && (ch <= 'z')){
		
			return true;
		}
		else{
			return false;
		}
		
	}
	//returns character as a lower case letter
	public static char toLowerCase(char ch){
		
		if ((ch >= 'A') && (ch <= 'Z')){
		
			ch = (char)(ch + 32);
		}
		return ch;
	}
	
	//checks if the character is upper case letter
	public static boolean isUpperCase(char ch){
		if((ch >= 'A') && (ch <= 'Z')){
			return true;
		}
		else{
			return false;
		}
	}
	
	//returns character as upper case
	public static char toUpperCase(char ch){
		if ((ch >= 'a') && (ch <= 'z')){
			
			//(65- A, 97-a u ASCII kodu)
			ch = (char)(ch - 32);
		}
		return ch;
	}
	
	
	@Override
	public String toString() {
		return "MyCharacter [ch=" + ch + "]";
	}
}
