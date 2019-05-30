package Day46_Static_keyword;

public class CompanyTest {

	public static void main(String[] args) {
	//print cname variable value
		
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
		
		
		Company c = new Company();
		System.out.println(c.cname);
	

	}

}
