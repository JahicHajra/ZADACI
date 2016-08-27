package Zadaci_25_08_2016;

public class MyString1 {
	
char[]chars;
	
	//no-arg constructor
	public MyString1(){
		
	}
	
	public MyString1( String s){
		
		
		this.chars = new char[s.length()];
		
		for(int i = 0; i < chars.length;i++){
			chars[i]=s.charAt(i);
		}
	}
	public MyString1(char[]chars){
		
		this.chars = chars;
	}
		
	public char charAt(int index){
		//	return character at given index
			return chars[index];
			
	}
		public int length(){
			//return length
			return chars.length;
		}

public MyString1 substring(int begin,int end){
	
	//returns the substring of a given string
	char[]substring = new char[end-begin];
	
	for(int i = begin; i< end;i++){
		substring[i-begin]=this.charAt(i);
	}
	return new MyString1(substring);

}
public MyString1 toLowerCase(){
	
	//returns string with lower case letter
	for(int i = 0;i < chars.length;i++){
		
		if(this.chars[i]>='A' && this.chars[i]<='Z'){
			
			this.chars[i] = (char)(this.chars[i]+32);
		}
	}
	return this;
}
public boolean equals(MyString1 s){
	//checking whether string is equal to another string
	boolean equal = false;
	
	for(int i = 0; i < s.length();i++){
		
		if(s.chars[i]==this.chars[i])
			
			equal = true;
	}
	return equal;
}

public static MyString1 valueOf(int i){
	//return string value
	return new MyString1(Integer.toString(i).toCharArray());
	}

@Override

public String toString(){
	
	String s = "";
	
	for(int i = 0; i < this.chars.length;i++){
		
		s+=this.chars[i];
		
	}
	return s;	
		
	}
}