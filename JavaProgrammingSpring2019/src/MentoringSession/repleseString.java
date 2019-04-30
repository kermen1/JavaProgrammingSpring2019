package MentoringSession;

public class repleseString {

	public static void main(String[] args) {
		// 1. replace
		// 2. replaceAll
		// 3. replaceFirst
		
		//Example 1
		
		String s1 = "The quick fox jumped";
		
		System.out.println("Before:"+s1);
		
		System.out.println("After replace :" +s1.replace("fox", "dog"));
		
		System.out.println("After replace all 'j' with 'a':"+ s1.replace('t','a'));
		
		//Example 2
		
		String s2 = "Cybertek is a good school.";
		//remove white spaces
		System.out.println("Before:"+s2);
		
		String str = s2.replaceAll("\\s","");
		System.out.println("After replaceAll:"+str);
		
		//Example 3
		
		String s3 = "Kermen love Java, maybe";
		System.out.println("Before: "+ s3);
		System.out.println("After replace:"+ s3.replaceAll("maybe","").replaceAll(",","."));
		
		
		String j = "#dsst26533ghdt546dghgfj";
		
		System.out.println(j.replaceAll("[ a-zA-Z0-9]", ""));
		
		//Example 4
		
		String str3 = "Great weather  today";
		//only Replace first 't' with '9'
		System.out.println("Before: "+ str3);
		String str4 = str3.replaceFirst("t","9");
		System.out.println(str4);
			
		
		

	}

}
