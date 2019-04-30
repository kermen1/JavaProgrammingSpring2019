package Day22;

public class lookJavaForWordInString {

	public static void main(String[] args) {
		String sentence = "He said hi,the she replied hi.hi guys!";
		
		//check if temp equals "hi", if true, add 1 to count
		int count =0;
		for(int i = 0; i < sentence.length()-1; i++) {
			String temp = sentence.substring(i,i+2);
			System.out.println(temp);
		
		
		//Count: 3
		if(temp.equals("hi")) {
			count++;
		}
		
		
		}
		System.out.println("Count: "+count);

	}

}
