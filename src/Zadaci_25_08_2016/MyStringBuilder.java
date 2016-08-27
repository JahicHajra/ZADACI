package Zadaci_25_08_2016;

public class MyStringBuilder {

	
String str;
	
	public MyStringBuilder(String s){
		
		this.str = s;
	}
	//method that append two strings and returns new string
	public MyStringBuilder append(MyStringBuilder s){
		
		this.str+=s.str;
		
		return new MyStringBuilder(this.str);
	}
	
	//method that appends integer to a string
	public MyStringBuilder append(int i){
		
		return new MyStringBuilder(this.str+=i);
	}
	//method that returns the string length
	public int length(){
		
		return str.length();
	}
	
	//method that returns character at given index
	public char charAt(int index){
		return str.charAt(index);
	}
	
	//method that returns new string with lower case letter
	public MyStringBuilder toLowerCase(){
		
		return new MyStringBuilder(str.toLowerCase());
	}
	
	//method that returns a new string from strings begin to string's end
	public MyStringBuilder substring(int begin, int end){
		
		String str ="";
		
		for(int i = begin;i<=end;i++){
			str+=this.str.charAt(i);
		}
		
		return new MyStringBuilder(str);
	}
	//overridden method that allows printing
	@Override
	public String toString(){
		
		return this.str;
		
	}	
}

