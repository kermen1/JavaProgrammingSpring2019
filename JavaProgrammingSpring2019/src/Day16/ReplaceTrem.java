package Day16;

public class ReplaceTrem {

	public static void main(String[] args) {
		String sentece = "Coding is fun, it is my hobby";
		
		String withNoSpaces = sentece.replace(" ", "");
		
		System.out.println(withNoSpaces);
		
		//replace, with!!!
		
		sentece = sentece.replace(",", "!!!");
		
		System.out.println(sentece);
		String mixed = "&^%$#@@#$%^&*";
		// clean mix
		
		mixed = mixed.replace("&^%$#@"," ");
		mixed = mixed.replace("@#$%^&*"," ");
		System.out.println(mixed);
		
		//mixed = mixed.replace("$","");
		
		mixed = mixed.replace("$","").replace("-","");
		System.out.println(mixed);
		
		
		String result = "About 115,000,000 results (0.59 seconds)";
		//using replace, get number of result
		
		result = result.replace("About ","");
		//result = result.replace(" results (0.59 seconds)",""); nigth break wh
		
		result = result.substring(0,result.indexOf(" "));
		
		
		System.out.println(result);
		
		
		
		
		

	}

}
