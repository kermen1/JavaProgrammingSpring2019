package Day22;

public class SubStringPrac {

	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		
		int i = 0;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		i++;
		System.out.println(word.substring(i,i+1));
		
		System.out.println("###################################");
		
		for(int n=0; n<=3;n++) {
			//System.out.println(word.substring(n,n+1));
			
			String letter = word.substring(n,n+1);
			System.out.println(letter);
		}
		
		System.out.println("###############reverse###########");
		//printe letters in reverse
		
		for(int n=3; n>=0;n--) {
			//System.out.println(word.substring(n,n+1));
			
			String letter = word.substring(n,n+1);
			System.out.println(letter);
		}
		
		int start =1 ;
		int end = 5;
		String word2 = "unitedStates";
		System.out.println(word2.substring(start,end));
		
		
	}

}
