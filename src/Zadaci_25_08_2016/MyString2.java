package Zadaci_25_08_2016;

public class MyString2 {

	
	String str;
	
	//constructor that uses string parameter to create object
		MyString2(String s){
			this.str = s;
			
		}
		
		//compare method
		public int compare(String s){
			
			//if string is greater than object return 1
			if(str.length()>s.length()){
				return 1;
			}
			//if string is equal to object return 0
			else if(str.length()==s.length()){
				return 0;
			}
			//if string is less than object return-1
			else{
				return -1;
			}
			
			
		}
		//substring method
		public MyString2 substring(int begin){
			
			//returns new string of a string starting from the given index
	String s = "";

	for(int i = begin;i < str.length();i++){
		
		s+=str.charAt(i);
	}
			return new MyString2(s);
			}
		
		
		//toUppercase method
		public MyString2 toUppercase(){
		
	//returns new string(string with the uppercase letter)
	String sToUpperCase = "";

	for(int i = 0; i < str.length();i++){
		
		sToUpperCase+=Character.toUpperCase(str.charAt(i));
	}

	return new MyString2(sToUpperCase);
	}
		
		//toChars method
	public char[]toChars(){
		
	//convert string to char array
		char[]ch = new char[this.str.length()];
		
		for(int i = 0; i < ch.length;i++){
			ch[i]=str.charAt(i);
		
	}
		return ch;
	}

	//valueOf method
	public static MyString2 valueOf(boolean b){
		
		//returns textual value of boolean variable b
		if (b) 
			return new MyString2("true");
		else
			return new MyString2("false");
	}

	@Override
	//method that allows printing the string
	public String toString() {
		
		return this.str;
	}

}
