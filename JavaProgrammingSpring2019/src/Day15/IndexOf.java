package Day15;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		             // 012345
		
		String word1 = "github";
		
		System.out.println(word1.indexOf('g'));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		
		String url = "ww.okta.com";
		int index = url.indexOf(".");
		
		System.out.println("Post of . :" + index);
		System.out.println(url.charAt(index+1));

		String title = "Java - Google Search";
		//find position of'-' and check if space
		// is on right and left sides
		int dash = title.indexOf('-');//5
		
		System.out.println(title.charAt(dash-1));//" "
		System.out.println(title.charAt(dash+1));//" "
		
		String country = "Unuted States of America";
		int states = country.indexOf("States");
		System.out.println("position of states: "+states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		
		// cheak if c++ is in the word2
		// 1) using contains
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		//2) using idexOf
		
		
		if(word2.indexOf("c++") >= -1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");	
		}
		
		
		
		
		
		
		

	}

}
