package Day15;

public class StartsAndEnds {

	public static void main(String[] args) {
		String word1 = "eclipse";
	//startsWith ==> test if string stars with another
		
		
		System.out.println(word1.startsWith("e"));//true
		System.out.println(word1.startsWith("ec"));//true
		System.out.println(word1.startsWith("ecli"));//true
		
		System.out.println(word1.startsWith("Ec"));//false
		
		System.out.println(word1.endsWith("e"));//true
		
		System.out.println(word1.endsWith("ipse"));//true
		System.out.println(word1.endsWith("java"));//false
		
		//"PSE"
		System.out.println(word1.toUpperCase().endsWith("PSE"));
		
		System.out.println(word1.endsWith("eclipse"));
		//Mr. Mrs. Ms. Dr.
		//Mr. ==> male
		//Mrs. ==> married woman
		//Ms. ==> Single woman
		//Dr. ==> Doctor man or women
		
		String name = "Mr.Jackson";
		
		
		if(name.startsWith("Mr.")) {
		    System.out.println(name.startsWith("Man"));
		}else if(name.startsWith("Mrs.")) {
			System.out.println(name.startsWith("married women"));
		}else if(name.startsWith("Ms.")) {
			System.out.println(name.startsWith("Single women"));
		}else if(name.startsWith("Dr.")) {
			System.out.println(name.startsWith("Doctor man or women"));
		}else {
			System.out.println(name.startsWith("Unknown status"));
		}
		
		
		
		
		
		
	}

}
