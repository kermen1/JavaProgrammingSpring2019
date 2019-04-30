package Day24;

public class ArrayOfChars {

	public static void main(String[] args) {
		char[] values = {'a','b','c'};
		for(char value:values) {
			System.out.println(value);
		}
		
		
		
	String str = "Wooden spoon";
	//this , method toCharArray() converts string into
	//array of characters
	char[] chars = str.toCharArray();
		for(char c:chars) {
			System.out.println(c+"_");
		}
		
		for(int i = chars.length-1;i>=0;i--) {
			System.out.println(chars[i]);
			str+=chars[i];
		}
		
		
        str=str.replace('o', '*');
        char [] chars1 = str.toCharArray();
        
        for (char c : chars1) {
            System.out.print(c);
        }
        
		
		
		
		

	}

}
