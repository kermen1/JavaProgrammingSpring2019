package Day16;

public class StrString {

	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//Baku, Azerbaijan
		
		str = str.replace("Moscow","Baku").replace("Russia","Azerbaijan");
		
		System.out.println(str);
		
		String email = "Kermen_kurs@gmail.com";
		
		String company ="capitalone";
		
		String newEmail = email.replace("gmail",company);
		System.out.println(newEmail);

	}

}
