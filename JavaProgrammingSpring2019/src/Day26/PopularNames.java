package Day26;

import java.util.Arrays;
import java.util.Random;

public class PopularNames {

	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };
		
		System.out.println("Popular name: "+names.length);
		//System.out.println(Arrays.toString(names));
		//Print two names to each line
		for(int i=0;i<names.length;i+=2) {
			System.out.println(names[i]+", "+names[i+1]);
		}
		
		//print male names in single line separate by comma
		System.out.println("Male Names: ");
		for(int j=0;j<names.length;j+=2) {
			System.out.print(names[j]+", ");
		}
		//print female names in singl line 
		System.out.println("\nFEMALE NAMES: ");
		for(int n=0;n<names.length;n++) {
			if(n%2 == 1) {
				if(n ==names.length-1) {
			System.out.print(names[n]);
		}else {
			System.out.println(names[n]+", ");
		}
			}
		}
		
		//print random name from our array
		//use Random class
		System.out.println("\nRANDOM NAME");
		Random random = new Random();
		int r = random.nextInt(names.length);
		
		System.out.println("Random name: "+names[r]);
		
		//PRINT all names that are up to 4 characters, in uppercase, in same line 
		
		for(String name:names) {
			if(name.length()<=4) {
				System.out.print(name.toUpperCase()+", ");
			}
		}
		System.out.println("\nNAMES LENGTH SORT");
		String names3to4 = "";
		String names5to6 = "";
		String names7orMore = "";
		
		for(String name: names) {
			if(name.length()<=4) {
				names3to4 += name+", ";
			}else if(name.length()==5 || name.length()==6) {
				names5to6 += name +", ";
			}else {
				names7orMore += name + ", ";
			}
		}
		
		System.out.println("namesUpto4: "+ names3to4.substring(0, names3to4.length()-2));
		System.out.println("names5to6: "+ names5to6);
		System.out.println("names7orMore: "+ names7orMore);
		
		System.out.println("*************************************************************************************************");
		
		
		System.out.println(Arrays.deepToString(names));
		//code here
		
		for(int i=0;i<names.length;i+=2) {
			String temp = names[i];
			names[i] = names[i+1];
			names[i+1] = temp;
		}
		
		
		
		System.out.println(Arrays.deepToString(names));
		
		
		String str1 = "first word";
		String str2 = "second word";
		String temp = str1;
		str1 = str2;
		str2 = temp;
		
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		
		
		
		
		
		
		

	}

}
